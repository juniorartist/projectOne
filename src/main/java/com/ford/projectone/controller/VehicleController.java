package com.ford.projectone.controller;


import com.ford.projectone.dao.VehicleRepo;
import com.ford.projectone.model.Vehicle;
import com.ford.projectone.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;


    //Save a vehicle
    @PostMapping("/vehicleInformation/submitVehicle")
    public String saveVehicle (@RequestBody Vehicle vehicle){
        vehicleService.save(vehicle);
        return "Vehicle saved";
    }

    //Get All vehicle list
    @GetMapping("/getVehicleInformation")
    public Iterable<Vehicle> getAllVehicle() {

    return vehicleService.list();
    }

//    //Get vehicle name by model
//    @GetMapping("/getVehicle/{model}")
//    public List<Vehicle> getVehicleByModel (@PathVariable String model){
//        return vehicleService.findByVehicleDetails(model);
//    }


}
