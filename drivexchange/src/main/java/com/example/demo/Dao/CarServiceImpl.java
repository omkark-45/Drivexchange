package com.example.demo.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Car;
import com.example.demo.Repo.CarRepo;
import com.example.demo.Services.ICarService;

@Service
public class CarServiceImpl implements ICarService {

    @Autowired
    private CarRepo carRepository;

    @Override
    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public List<Car> getCarsBySellerId(Long sellerId) {
        return carRepository.findBySellerUserId(sellerId);
    }

    @Override
    public List<Car> getAvailableCars() {
        return carRepository.findByStatus("Available");
    }

    @Override
    public Car getCarById(Long carId) {
        return carRepository.findById(carId).orElse(null);
    }

    @Override
    public void deleteCar(Long carId) {
        carRepository.deleteById(carId);
    }
}
