package com.example.demo.car.model;

import com.example.demo.car.constant.CarTypeConstant;
import org.springframework.stereotype.Component;

@Component
public class Cabrio implements Car {

    @Override
    public String getType() {
        return CarTypeConstant.CAR_TYPE_CABRIO;
    }
}
