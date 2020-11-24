package com.example.demo.car.model;

import org.apache.commons.lang.StringUtils;

public interface Car {

    public String getType();

    default public String produce() {
        return StringUtils.capitalize(getType()) + " Car has produced.";
    }
}


