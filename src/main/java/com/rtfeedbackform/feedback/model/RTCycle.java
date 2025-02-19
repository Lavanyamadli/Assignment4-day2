package com.rtfeedbackform.feedback.model;


import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "rt_cycle")
public class RTCycle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer startMonth;
    private Integer startYear;
    private Integer endMonth;
    private Integer endYear;

    @Column(name = "is_active", nullable = false)
    private Boolean isActive;
}