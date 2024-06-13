package com.aston.homework.lecture9.builder;

public class Car {
    
    private String model;

    private Platform platform;

    private int price;

    public void setModel(String model) {
        this.model = model;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [model=" + model + ", platform=" + platform + ", price=" + price + "]";
    }

}
