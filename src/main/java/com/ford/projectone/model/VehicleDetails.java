package com.ford.projectone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;


@Data
@AllArgsConstructor

@Embeddable
public class VehicleDetails {


    private String make;
    private String  model;
    private String modelYear;
    private String bodyStyle;
    private String engine;
    private String driveType;
    private String color;
    private String MPG;

    public VehicleDetails () {}


}
