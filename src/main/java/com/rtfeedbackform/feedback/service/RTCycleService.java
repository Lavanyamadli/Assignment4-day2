package com.rtfeedbackform.feedback.service;

import com.rtfeedbackform.feedback.model.RTCycle;
import com.rtfeedbackform.feedback.repository.RTCycleRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RTCycleService {

    private final RTCycleRepository rtCycleRepository;

    public RTCycleService(RTCycleRepository rtCycleRepository) {
        this.rtCycleRepository = rtCycleRepository;
    }

    public RTCycle createRtCycle(RTCycle rtCycle) {
        return rtCycleRepository.save(rtCycle);
    }

    public List<RTCycle> getAllRtCycles() {
        return rtCycleRepository.findAll();
    }
}
