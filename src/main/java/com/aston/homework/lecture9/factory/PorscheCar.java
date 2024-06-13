package com.aston.homework.lecture9.factory;

public class PorscheCar implements Car {

    @Override
    public void createCar() {
        System.out.println("Создание автомобиля Porsche.");    
    }
    
}
