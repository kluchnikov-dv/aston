package com.aston.homework.lecture9.builder;

public class AudiA7CarBuilder extends CarBuilder{

    @Override
    void buildModel() {
        car.setModel("Audi A7");        
    }

    @Override
    void buildPlatform() {
        car.setPlatform(Platform.Typ4G);        
    }

    @Override
    void buildPrice() {
        car.setPrice(3000_000);        
    }
    
}
