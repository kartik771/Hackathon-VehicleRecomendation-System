package com.VehicleRecommendationSystem.Vehicle.Recommendation.System.service;

import com.VehicleRecommendationSystem.Vehicle.Recommendation.System.dto.PassengerDTO;
import com.VehicleRecommendationSystem.Vehicle.Recommendation.System.entities.VehicleDetails;
import com.VehicleRecommendationSystem.Vehicle.Recommendation.System.repos.VehicleDetailsRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class VehicleRecommendationService {

    private VehicleDetailsRepository vehicleRepository;

    @Autowired
    public VehicleRecommendationService(VehicleDetailsRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<VehicleDetails> recommendVehicles(PassengerDTO passengerDTO) {
        List<VehicleDetails> allVehicles = vehicleRepository.findAll();
        Integer userLocationId = passengerDTO.getCustomerLocationId();
        Integer userPassengers = passengerDTO.getPassengerCount();


        allVehicles.sort((v1, v2) -> {
            int distance1 = (userLocationId - v1.getLocationId()) * (userLocationId - v1.getLocationId());
            int distance2 = (userLocationId - v2.getLocationId()) * (userLocationId - v2.getLocationId());
            return Integer.compare(distance1, distance2);
        });


        List<VehicleDetails> recommendedCabs = new ArrayList<>();
        List<VehicleDetails> recommendedAutos = new ArrayList<>();
        List<VehicleDetails> recommendedBikes = new ArrayList<>();

        for (VehicleDetails vehicle : allVehicles) {
            if (vehicle.getIsOccupied() && vehicle.getPassengerCount() >= userPassengers) {
                if ("car".equals(vehicle.getVehicleCategory()) && recommendedCabs.size() < 3) {
                    recommendedCabs.add(vehicle);
                } else if ("auto".equals(vehicle.getVehicleCategory()) && recommendedAutos.size() < 3) {
                    recommendedAutos.add(vehicle);
                } else if ("bike".equals(vehicle.getVehicleCategory()) && recommendedBikes.size() < 3) {
                    recommendedBikes.add(vehicle);
                }
            }


            if (recommendedCabs.size() == 3 && recommendedAutos.size() == 3 && recommendedBikes.size() == 3) {
                break;
            }
        }

        List<VehicleDetails> recommendedVehicles = new ArrayList<>();
        recommendedVehicles.addAll(recommendedCabs);
        recommendedVehicles.addAll(recommendedAutos);
        recommendedVehicles.addAll(recommendedBikes);

        return recommendedVehicles;
    }
}
