package com.aston.homework.lecture1.task2;

/**
* 2. Практикуйтесь в использовании статических и нестатических блоков инициализации
*/
public class Demo {
    public static void main(String[] args) {
        Point.x = Point.y = 3;    
        System.out.print("Далее выполнятся вызываемый статический метод, значения координат точки: " );         
        Point.print('A');
        System.out.println();

        Point a = new Point();        
        System.out.print("Не статический блок инициализации выполняется только при создании экземпляра объекта, значения координат точки: " );         
        a.print('A');
        System.out.println();
    }
}
