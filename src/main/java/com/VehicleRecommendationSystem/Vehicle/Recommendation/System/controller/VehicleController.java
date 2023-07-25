package com.VehicleRecommendationSystem.Vehicle.Recommendation.System.controller;

import com.VehicleRecommendationSystem.Vehicle.Recommendation.System.dto.PassengerDTO;
import com.VehicleRecommendationSystem.Vehicle.Recommendation.System.service.VehicleRecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("vehicle")
public class VehicleController {
    @Autowired
    private VehicleRecommendationService vehicleRecommendationService;

    @GetMapping("/recommend-vehicle")
    public ResponseEntity<?> recommendVehicle(PassengerDTO passengerDTO)
    {
        return new ResponseEntity<>(vehicleRecommendationService.recommendVehicles(passengerDTO), HttpStatus.OK);
    }
}
