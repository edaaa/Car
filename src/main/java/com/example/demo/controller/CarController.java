package com.example.demo.controller;

import com.example.demo.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping("/car/{type}")
    public String getCarType(@PathVariable("type") String type) {
      String sentence = carService.getCarProduceFromType(type);
      return sentence;
    }
}
