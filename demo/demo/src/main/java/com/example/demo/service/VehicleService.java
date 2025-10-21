package com.example.demo.service;

import com.example.demo.model.Vehicle;
import java.util.List;

public interface VehicleService {
    List<Vehicle> getVehiclesByServiceYear(int serviceYear);
    String getVehicleTypeByServiceId(Long serviceId);
    void deleteVehiclesByServiceYear(int serviceYear);
    Vehicle saveVehicle(Vehicle vehicle); // helper to add sample data via API
}
