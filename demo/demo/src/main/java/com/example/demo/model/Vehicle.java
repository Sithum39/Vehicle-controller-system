package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serviceId;

    @Column(nullable = false)
    private String vehicleType;

    private String vehicleNumber;
    private int serviceYear;

    // Constructors
    public Vehicle() {
    }

    public Vehicle(String vehicleType, String vehicleNumber, int serviceYear) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        this.serviceYear = serviceYear;
    }

    // Getters and Setters
    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getServiceYear() {
        return serviceYear;
    }

    public void setServiceYear(int serviceYear) {
        this.serviceYear = serviceYear;
    }
}

