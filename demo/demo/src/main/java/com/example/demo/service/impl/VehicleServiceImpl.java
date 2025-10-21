package com.example.demo.service.impl;

import com.example.demo.model.Vehicle;
import com.example.demo.repository.VehicleRepository;
import com.example.demo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public List<Vehicle> getVehiclesByServiceYear(int serviceYear) {
        return vehicleRepository.findByServiceYear(serviceYear);
    }

    @Override
    public String getVehicleTypeByServiceId(Long serviceId) {
        return vehicleRepository.findVehicleTypeByServiceId(serviceId);
    }

    @Override
    public void deleteVehiclesByServiceYear(int serviceYear) {
        vehicleRepository.deleteByServiceYear(serviceYear);
    }

    @Override
    public Vehicle saveVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
}
