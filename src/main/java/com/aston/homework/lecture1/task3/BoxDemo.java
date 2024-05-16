package com.aston.homework.lecture1.task3;

public class BoxDemo {
        
    public static void main(String[] args) {        
        
        //Установка значений через конструктор
        Box box1 = new Box(5, 10, 15);
       
        System.out.println("Volume box1 = " + box1.Volume());
        
        //Устанвока значений через сеттеры
        Box box2 = new Box();

        box2.setWidth(10);
        box2.setHeight(20);
        box2.setDepth(30);
        
        System.out.println("Volume box5 = " + box2.Volume());

        //Непосредственное присваивание значений полям объекта
        Box box3 = new Box();

        box3.width = 1.1;
        box3.height = 2.2;
        box3.depth = 3.3;

        System.out.println("Volume box6 = " + box3.Volume());
    }

}
