package com.rtfeedbackform.feedback.service;

import com.rtfeedbackform.feedback.model.*;
import com.rtfeedbackform.feedback.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.UUID;

@Service
public class RTSubmissionService {
    @Autowired
    private RTSubmissionRepository rtSubmissionRepository;

    public RTSubmission submitRTFeedback(RTSubmission submission) {
        return rtSubmissionRepository.save(submission);
    }

    public List<RTSubmission> getSubmissionsByEmployee(UUID employeeId) {
        return rtSubmissionRepository.findByEmployeeId(employeeId);
    }
}