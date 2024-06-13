package com.aston.homework.lecture9.factory;

public class AudiCarFActory implements CarFactory {

    @Override
    public Car createCar() {
        return new AudiCar();
    }
    
}
