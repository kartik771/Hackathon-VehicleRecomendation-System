package com.VehicleRecommendationSystem.Vehicle.Recommendation.System.bootstrap;

import com.VehicleRecommendationSystem.Vehicle.Recommendation.System.entities.VehicleDetails;
import com.VehicleRecommendationSystem.Vehicle.Recommendation.System.repos.VehicleDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {
    @Autowired
    private VehicleDetailsRepository vehicleDetailsRepository;
    @Override
    public void run(String... args) throws Exception {
        VehicleDetails vehicleDetails = new VehicleDetails();
        vehicleDetails.setLocationId(101);
        vehicleDetails.setVehicleNumber("HR-26 6754");
        vehicleDetails.setVehicleCategory("auto");
        vehicleDetails.setIsOccupied(false);
        vehicleDetails.setPassengerCount(2);
        vehicleDetails.setDriverContact("78990245");
        vehicleDetailsRepository.save(vehicleDetails);


        VehicleDetails vehicleDetails1 = new VehicleDetails();
        vehicleDetails1.setLocationId(100);
        vehicleDetails1.setVehicleNumber("HR-26 0091");
        vehicleDetails1.setVehicleCategory("car");
        vehicleDetails1.setIsOccupied(true);
        vehicleDetails1.setPassengerCount(4);
        vehicleDetails1.setDriverContact("090909878");
        vehicleDetailsRepository.save(vehicleDetails1);


        VehicleDetails vehicleDetails2 = new VehicleDetails();
        vehicleDetails2.setLocationId(201);
        vehicleDetails2.setVehicleNumber("HR-26 7896");
        vehicleDetails2.setVehicleCategory("auto");
        vehicleDetails2.setIsOccupied(false);
        vehicleDetails2.setPassengerCount(2);
        vehicleDetails2.setDriverContact("09876534");
        vehicleDetailsRepository.save(vehicleDetails2);


        VehicleDetails vehicleDetails3 = new VehicleDetails();
        vehicleDetails3.setLocationId(301);
        vehicleDetails3.setVehicleNumber("HR-26 2345");
        vehicleDetails3.setVehicleCategory("car");
        vehicleDetails3.setIsOccupied(true);
        vehicleDetails3.setPassengerCount(5);
        vehicleDetails3.setDriverContact("78902564");
        vehicleDetailsRepository.save(vehicleDetails3);


        VehicleDetails vehicleDetails4 = new VehicleDetails();
        vehicleDetails4.setLocationId(110);
        vehicleDetails4.setVehicleNumber("HR-26 8798");
        vehicleDetails4.setVehicleCategory("car");
        vehicleDetails4.setIsOccupied(false);
        vehicleDetails4.setPassengerCount(4);
        vehicleDetails4.setDriverContact("987654");
        vehicleDetailsRepository.save(vehicleDetails);


        VehicleDetails vehicleDetails5 = new VehicleDetails();
        vehicleDetails5.setLocationId(111);
        vehicleDetails5.setVehicleNumber("HR-26 7891");
        vehicleDetails5.setVehicleCategory("bike");
        vehicleDetails5.setIsOccupied(false);
        vehicleDetails5.setPassengerCount(1);
        vehicleDetails5.setDriverContact("87902453");
        vehicleDetailsRepository.save(vehicleDetails5);


        VehicleDetails vehicleDetails6 = new VehicleDetails();
        vehicleDetails6.setLocationId(102);
        vehicleDetails6.setVehicleNumber("HR-26 5678");
        vehicleDetails6.setVehicleCategory("bike");
        vehicleDetails6.setIsOccupied(true);
        vehicleDetails6.setPassengerCount(1);
        vehicleDetails6.setDriverContact("78902453");
        vehicleDetailsRepository.save(vehicleDetails6);


        VehicleDetails vehicleDetails7 = new VehicleDetails();
        vehicleDetails7.setLocationId(220);
        vehicleDetails7.setVehicleNumber("HR-26 7418");
        vehicleDetails7.setVehicleCategory("auto");
        vehicleDetails7.setIsOccupied(true);
        vehicleDetails7.setPassengerCount(2);
        vehicleDetails7.setDriverContact("78990246");
        vehicleDetailsRepository.save(vehicleDetails7);


        VehicleDetails vehicleDetails8 = new VehicleDetails();
        vehicleDetails8.setLocationId(250);
        vehicleDetails8.setVehicleNumber("HR-26 2589");
        vehicleDetails8.setVehicleCategory("car");
        vehicleDetails8.setIsOccupied(false);
        vehicleDetails8.setPassengerCount(4);
        vehicleDetails8.setDriverContact("78660245");
        vehicleDetailsRepository.save(vehicleDetails8);


        VehicleDetails vehicleDetails9 = new VehicleDetails();
        vehicleDetails9.setLocationId(150);
        vehicleDetails9.setVehicleNumber("HR-26 2587");
        vehicleDetails9.setVehicleCategory("car");
        vehicleDetails9.setIsOccupied(false);
        vehicleDetails9.setPassengerCount(5);
        vehicleDetails9.setDriverContact("78690245");
        vehicleDetailsRepository.save(vehicleDetails9);


        VehicleDetails vehicleDetail = new VehicleDetails();
        vehicleDetail.setLocationId(151);
        vehicleDetail.setVehicleNumber("HR-26 7458");
        vehicleDetail.setVehicleCategory("auto");
        vehicleDetail.setIsOccupied(false);
        vehicleDetail.setPassengerCount(2);
        vehicleDetail.setDriverContact("7899027485");
        vehicleDetailsRepository.save(vehicleDetail);


        VehicleDetails vehicleDetail1 = new VehicleDetails();
        vehicleDetail1.setLocationId(152);
        vehicleDetail1.setVehicleNumber("HR-26 8569");
        vehicleDetail1.setVehicleCategory("bike");
        vehicleDetail1.setIsOccupied(false);
        vehicleDetail1.setPassengerCount(1);
        vehicleDetail1.setDriverContact("76969245");
        vehicleDetailsRepository.save(vehicleDetail1);




//

//

    }
}
