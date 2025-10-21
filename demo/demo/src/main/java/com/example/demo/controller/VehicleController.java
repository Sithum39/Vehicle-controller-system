package com.example.demo.controller;

import com.example.demo.model.Vehicle;
import com.example.demo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;



    // Save a vehicle (helper endpoint to add test data)
    @PostMapping
    public Vehicle createVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.saveVehicle(vehicle);
    }

    // Q1: get all vehicles by year
    @GetMapping("/year/{year}")
    public List<Vehicle> getVehiclesByYear(@PathVariable int year) {
        return vehicleService.getVehiclesByServiceYear(year);
    }

    // Q2: get vehicle type by service id
    @GetMapping("/type/{serviceId}")
    public String getVehicleTypeByServiceId(@PathVariable Long serviceId) {
        return vehicleService.getVehicleTypeByServiceId(serviceId);
    }

    // Q3: delete all vehicles for a year
    @DeleteMapping("/year/{year}")
    public String deleteVehiclesByYear(@PathVariable int year) {
        vehicleService.deleteVehiclesByServiceYear(year);
        return "Deleted all vehicle service records for year " + year;
    }
}
