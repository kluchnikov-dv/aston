package com.aston.homework.lecture9.builder;

public class PorscheMacanCarBuilder extends CarBuilder{

    @Override
    void buildModel() {
        car.setModel("Porsche Macan");
    }

    @Override
    void buildPlatform() {
        car.setPlatform(Platform.Type95B);        
    }

    @Override
    void buildPrice() {
        car.setPrice(16_000_000);        
    }
    
}
