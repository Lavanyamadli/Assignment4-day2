package com.rtfeedbackform.feedback.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rt_submission")
public class RTSubmission {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @ManyToOne
    private Employee employee;
    @ManyToOne
    private RTCycle cycle;
    private String submissionText;
    private Double finalRating;
    private Boolean isApproved = false;
    private Boolean adminOverride = false;
    private String overrideReason;
}
