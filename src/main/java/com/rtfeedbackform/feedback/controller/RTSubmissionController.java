package com.rtfeedbackform.feedback.controller;


import com.rtfeedbackform.feedback.model.*;
import com.rtfeedbackform.feedback.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rt-submission")
public class RTSubmissionController {
    @Autowired
    private RTSubmissionService rtSubmissionService;

    @PostMapping("/submit")
    public RTSubmission submitRTFeedback(@RequestBody RTSubmission submission) {
        return rtSubmissionService.submitRTFeedback(submission);
    }
}