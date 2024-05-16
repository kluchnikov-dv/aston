package com.aston.homework.lecture1.task4;

public class BoxDemo {
        
    public static void main(String[] args) {      
        //Перегрузка конструкторов  
        Box box1 = new Box();
        Box box2 = new Box(5, 10, 15);
        Box box3 = new Box(10);
        Box box4 = new Box(box2);

        System.out.println("Volume box1 = " + box1.Volume());
        System.out.println("Volume box2 = " + box2.Volume());
        System.out.println("Volume box3 = " + box3.Volume());
        System.out.println("Volume box4 = " + box4.Volume());
    }

}
