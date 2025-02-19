package com.rtfeedbackform.feedback.service;

import com.rtfeedbackform.feedback.model.Notification;
import com.rtfeedbackform.feedback.repository.NotificationRepository;
import com.rtfeedbackform.feedback.repository.RTCycleRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;
    private final RTCycleRepository rtCycleRepository;
    private final EmailNotificationService emailNotificationService;

    public NotificationService(NotificationRepository notificationRepository,
                               RTCycleRepository rtCycleRepository,
                               EmailNotificationService emailNotificationService) {
        this.notificationRepository = notificationRepository;
        this.rtCycleRepository = rtCycleRepository;
        this.emailNotificationService = emailNotificationService;
    }

    @Transactional
    public Notification createNotification(Notification notification) {
        // Validate cycle ID
        if (!rtCycleRepository.existsById(notification.getCycle().getId())) {
            throw new IllegalArgumentException("RT Cycle ID does not exist: " + notification.getCycle().getId());
        }

        // Save notification in database
        Notification savedNotification = notificationRepository.save(notification);

        // Send email notification
        emailNotificationService.sendNotificationEmail(
                "lavanyamadli1905@gmail.com",  // Replace with the actual recipient email
                "New Notification",
                savedNotification.getMessage()
        );

        return savedNotification;
    }
}
