package com.ford.projectone;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ford.projectone.model.Vehicle;
import com.ford.projectone.service.VehicleService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class ProjectoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectoneApplication.class, args);
    }


//    @Bean
//    CommandLineRunner runner(VehicleService vehicleService){
//        return args -> {
//            // read JSON and load json
//            ObjectMapper mapper = new ObjectMapper();
//            TypeReference<List<Vehicle>> typeReference = new TypeReference<List<Vehicle>>(){};
//            InputStream inputStream = TypeReference.class.getResourceAsStream("/json/vehicles.json");
//            try {
//                List<Vehicle> vehicles = mapper.readValue(inputStream,typeReference);
//                vehicleService.save((Vehicle) vehicles);
//                System.out.println("vehicles Saved!");
//            } catch (IOException e){
//                System.out.println("Unable to save vehicles: " + e.getMessage());
//            }
//        };
//    }
}
