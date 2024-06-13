package com.aston.homework.lecture9.factory;

public class PorscheCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new PorscheCar();
    }
    
}
