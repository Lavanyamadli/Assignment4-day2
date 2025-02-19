package com.rtfeedbackform.feedback.repository;

import com.rtfeedbackform.feedback.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface NotificationRepository extends JpaRepository<Notification, UUID> {
}
