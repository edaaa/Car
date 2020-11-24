package com.example.demo.car;

public class CarTypeNotFoundException extends Exception{

    public CarTypeNotFoundException(){
        super("Car type not found");
    }
}
