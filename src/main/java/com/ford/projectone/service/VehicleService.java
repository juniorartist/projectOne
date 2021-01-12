package com.ford.projectone.service;


import com.ford.projectone.dao.VehicleRepo;
import com.ford.projectone.model.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepo vehicleRepo;


    public Iterable<Vehicle> list() {
        return vehicleRepo.findAll();
    }

    public Vehicle save(Vehicle vehicle){
        return vehicleRepo.save(vehicle);
    }


}
