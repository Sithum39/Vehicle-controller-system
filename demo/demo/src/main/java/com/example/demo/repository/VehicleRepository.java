package com.example.demo.repository;

import com.example.demo.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

    // Q1: find all by service year
    List<Vehicle> findByServiceYear(int serviceYear);

    // Q2: get only vehicleType by serviceId
    @Query("SELECT v.vehicleType FROM Vehicle v WHERE v.serviceId = :serviceId")
    String findVehicleTypeByServiceId(Long serviceId);
    @Modifying
    @Transactional
    @Query("DELETE FROM Vehicle v WHERE v.serviceYear = :serviceYear")
    void deleteByServiceYear(int serviceYear);
}

