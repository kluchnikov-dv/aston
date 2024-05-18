package com.aston.homework.lecture1.task3;

/**
* 3. Попробуйте различные варианты установки значений свойств объектов:
*    через конструктор, сеттеры и непосредственное присваивание значений полям объекта.
*/
public class Demo {
   
    public static void main(String[] args) {
        
        //Установка значений через конструтор
        Point a = new Point();
        Point b = new Point(1, 1);        

        System.out.println("Установка значений через конструтор:");
        a.print('A');
        b.print('B');
        System.out.println();
        
        //Установка значений через сеттеры
        a.setXY(2, 2);
        b.setX(3);
        b.setY(3);
        
        System.out.println("Установка значений через сеттеры:");
        a.print('A');
        b.print('B');        
        System.out.println();
        
        //Непосредственное присваивание значений полям объекта
        a.x = a.y = 4;
        b.x = b.y = 5;

        System.out.println("Непосредственное присваивание значений полям объекта:");
        a.print('A');
        b.print('B');        
        System.out.println();
    }
}
