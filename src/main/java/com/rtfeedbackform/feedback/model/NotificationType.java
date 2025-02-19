package com.rtfeedbackform.feedback.model;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum NotificationType {
    CYCLE_STARTED,
    CYCLE_ENDED,
    GENERAL_NOTIFICATION,
    FEEDBACK_REMINDER,
    FEEDBACK_SUBMITTED,
    PERFORMANCE_FEEDBACK; // Add this if required

    @JsonCreator
    public static NotificationType fromString(String value) {
        for (NotificationType type : NotificationType.values()) {
            if (type.name().equalsIgnoreCase(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Invalid NotificationType: " + value);
    }

    @JsonValue
    public String toJson() {
        return name();
    }
}
