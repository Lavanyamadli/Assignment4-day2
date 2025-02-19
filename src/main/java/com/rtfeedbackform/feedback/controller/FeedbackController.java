package com.rtfeedbackform.feedback.controller;
import com.rtfeedbackform.feedback.model.*;
import com.rtfeedbackform.feedback.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController
@RequestMapping("/feedback")
public class FeedbackController {
    @Autowired
    private FeedbackService feedbackService;

    @PostMapping("/submit")
    public Feedback submitFeedback(@RequestBody Feedback feedback) {
        return feedbackService.saveFeedback(feedback);
    }

    @GetMapping("/employee/{employeeId}")
    public List<Feedback> getFeedbackByEmployee(@PathVariable UUID employeeId) {
        return feedbackService.getFeedbackByEmployee(employeeId);
    }
}
