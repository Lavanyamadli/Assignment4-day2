package com.rtfeedbackform.feedback.service;

import com.rtfeedbackform.feedback.model.*;
import com.rtfeedbackform.feedback.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;


@Service
public class FeedbackService {
    @Autowired
    private FeedbackRepository feedbackRepository;

    public Feedback saveFeedback(Feedback feedback) {
        return feedbackRepository.save(feedback);
    }

    public List<Feedback> getFeedbackByEmployee(UUID employeeId) {
        return feedbackRepository.findByEmployeeId(employeeId);
    }
}