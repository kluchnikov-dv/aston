package com.aston.homework.lecture9.factory;

public class VWCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new VWCar();
    }
    
}
