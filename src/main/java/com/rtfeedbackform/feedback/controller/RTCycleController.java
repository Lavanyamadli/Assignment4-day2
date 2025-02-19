package com.rtfeedbackform.feedback.controller;

import com.rtfeedbackform.feedback.model.RTCycle;
import com.rtfeedbackform.feedback.service.RTCycleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/rt-cycle")
public class RTCycleController {

    private final RTCycleService rtCycleService;

    public RTCycleController(RTCycleService rtCycleService) {
        this.rtCycleService = rtCycleService;
    }

    @PostMapping
    public ResponseEntity<RTCycle> createRtCycle(@RequestBody RTCycle rtCycle) {
        RTCycle savedCycle = rtCycleService.createRtCycle(rtCycle);
        return ResponseEntity.ok(savedCycle);
    }

    @GetMapping
    public ResponseEntity<List<RTCycle>> getAllRtCycles() {
        return ResponseEntity.ok(rtCycleService.getAllRtCycles());
    }
}
