package com.VehicleRecommendationSystem.Vehicle.Recommendation.System.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class VehicleDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;
    private Integer locationId;
    private String vehicleNumber;
    private String vehicleCategory;
    @JsonIgnore
    private Integer passengerCount;
    private String driverContact;
    @JsonIgnore
    private Boolean isOccupied;
}
