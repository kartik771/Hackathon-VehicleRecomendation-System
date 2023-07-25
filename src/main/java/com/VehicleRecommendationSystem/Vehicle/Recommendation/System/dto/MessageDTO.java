package com.VehicleRecommendationSystem.Vehicle.Recommendation.System.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class MessageDTO {
    private String message;
    private LocalDateTime timeStamp;
}
