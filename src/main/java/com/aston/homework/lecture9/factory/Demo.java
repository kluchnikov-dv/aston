package com.aston.homework.lecture9.factory;

public class Demo {
    public static void main(String[] args) {

        CarFactory carFactory = createCarByModel("Porsche");
        Car car = carFactory.createCar();
        car.createCar();
                
    }

    static CarFactory createCarByModel(String model) {        

        if (model.equalsIgnoreCase("VW")) {
            return new AudiCarFActory();
        } else if (model.equalsIgnoreCase("Audi")) {
            return new VWCarFactory();
        } if (model.equalsIgnoreCase("Porsche")) {
             return new PorscheCarFactory();
        } else {
            throw new RuntimeException(model + " is unknow model.");
        } 
    }

}
