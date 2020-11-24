package com.example.demo.car;

import com.example.demo.car.model.Car;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarResolver {
    private List<Car> cars;

    public CarResolver(List<Car> cars) {
        this.cars = cars;
    }

    public Car getCarFromType(String type) throws CarTypeNotFoundException {
        for (Car car : cars) {
            if (car.getType().equals(type)) {
                return car;
            }
        }
        throw new CarTypeNotFoundException();
    }
}
