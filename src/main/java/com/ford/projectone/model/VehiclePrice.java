package com.ford.projectone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
@Data
@AllArgsConstructor

@Embeddable
public class VehiclePrice {

    private String msrp;
    private String savings;
    private String finalPrice;

    public VehiclePrice (){}
}
