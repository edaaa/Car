package com.example.demo.services;


import com.example.demo.car.CarResolver;
import com.example.demo.car.CarTypeNotFoundException;
import com.example.demo.car.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarResolver carResolver;

    @Override
    public String getCarProduceFromType(String type) {
        try {
            Car car = carResolver.getCarFromType(type);
            return car.produce();
        } catch (CarTypeNotFoundException e) {
            return e.getMessage();
        }
    }
}
