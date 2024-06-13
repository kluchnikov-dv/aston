package com.aston.homework.lecture9.builder;

public class Director {
    
    CarBuilder builder;

    public void setBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    Car buildCar() {
        builder.createCar();
        builder.buildModel();
        builder.buildPlatform();
        builder.buildPrice();

        return builder.getCar();
    }
}
