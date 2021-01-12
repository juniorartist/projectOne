package com.ford.projectone.dao;

import com.ford.projectone.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;


public interface VehicleRepo extends JpaRepository<Vehicle ,Integer> {

}
