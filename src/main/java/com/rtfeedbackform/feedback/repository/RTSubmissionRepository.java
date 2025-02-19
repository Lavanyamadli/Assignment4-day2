package com.rtfeedbackform.feedback.repository;



import com.rtfeedbackform.feedback.model.*;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface RTSubmissionRepository extends JpaRepository<RTSubmission, UUID> {
    List<RTSubmission> findByEmployeeId(UUID employeeId);
}