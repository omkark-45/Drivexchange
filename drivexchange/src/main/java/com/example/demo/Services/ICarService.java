package com.example.demo.Services;

import java.util.List;

import com.example.demo.Model.Car;

public interface ICarService {
    Car addCar(Car car);
    List<Car> getAllCars();
    List<Car> getCarsBySellerId(Long sellerId);
    List<Car> getAvailableCars();
    Car getCarById(Long carId);
    void deleteCar(Long carId);
}
