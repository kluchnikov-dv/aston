package com.aston.homework.lecture9.factory;

public class VWCar implements Car {

    @Override
    public void createCar() {        
        System.out.println("Создание автомобиля VolksWagen.");        
    }
    
}
