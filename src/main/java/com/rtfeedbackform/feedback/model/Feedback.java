package com.rtfeedbackform.feedback.model;

import jakarta.persistence.*;
import lombok.*;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JoinColumn(name = "employee_id", nullable = false)
    private UUID id;
    @ManyToOne
    private Employee employee;
    private int month;
    private int year;
    private String feedbackText;
    private String attachmentUrl;
    private String submittedAt;

}
