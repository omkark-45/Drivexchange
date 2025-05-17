package com.example.demo.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Car;

public interface CarRepo extends JpaRepository<Car, Long> {
    List<Car> findByStatus(String status);
    List<Car> findBySellerUserId(Long sellerId);
}
