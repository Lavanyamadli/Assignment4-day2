package com.rtfeedbackform.feedback.controller;


import com.rtfeedbackform.feedback.model.*;
import com.rtfeedbackform.feedback.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @GetMapping
    public ResponseEntity<String> getAdminDashboard() {
        return ResponseEntity.ok("Admin Dashboard is working!");
    }

    @PostMapping
    public ResponseEntity<String> createAdmin() {
        return ResponseEntity.ok("Admin created successfully!");
    }

}
