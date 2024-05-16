package com.aston.homework.lecture1.task3;

public class Box {
    
    double width;
    double height;
    double depth;

    //Get и Set
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    //Конструктор по умолчанию
    Box() {
                
    }

    //Принять параметры
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;        
    }

    double Volume() {
        return width * height * depth;
    }
    
}
