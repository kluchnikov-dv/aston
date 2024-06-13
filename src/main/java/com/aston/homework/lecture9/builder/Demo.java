package com.aston.homework.lecture9.builder;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();
        
        director.setBuilder(new PorscheMacanCarBuilder());
        Car car = director.buildCar();
        System.out.println(car);
    }
}
