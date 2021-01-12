package com.ford.projectone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor

//@Table(name = "Vehicle_Table")
public class Vehicle {
    @Id
    @GeneratedValue
    private int id;

    @Embedded
    private VehicleDetails vehicleDetails;


    private String exterior;

    private String interior;

    @Embedded
    private VehiclePrice vehiclePrice;

    public Vehicle(){}
}
