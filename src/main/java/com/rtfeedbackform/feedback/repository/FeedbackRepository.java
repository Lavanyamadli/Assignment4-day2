package com.rtfeedbackform.feedback.repository;


import com.rtfeedbackform.feedback.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface FeedbackRepository extends JpaRepository<Feedback, UUID> {
    List<Feedback> findByEmployeeId(UUID employeeId);

}