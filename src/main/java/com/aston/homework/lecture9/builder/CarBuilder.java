package com.aston.homework.lecture9.builder;

public abstract class CarBuilder {
   
    Car car;
    
    void createCar() {
        car = new Car();
    }

    abstract void  buildModel();

    abstract void  buildPlatform();

    abstract void buildPrice();

    Car getCar() {
        return car;
    }
}
