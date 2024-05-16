package com.aston.homework.lecture1.task4;

public class Box {
    
    private double width;
    private double height;
    private double depth;

    //Инициализация по усолчанию
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    //Принять параметры
    Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;        
    }

    //Куб
    Box(double cubeSize) {
        width = height = depth = cubeSize;
    }

    //Копия
    Box(Box box) {
        width = box.width;
        height = box.height;
        depth = box.depth;
    }

    double Volume() {
        return width * height * depth;
    }
    
}
