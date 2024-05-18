package com.aston.homework.lecture1.task1;

/**
* 1. Создание нескольких классов с разными полями, конструкторами и методами.
*/
public class Demo {
   
    public static void main(String[] args) {
        
        //Линия
        Point a = new Point(1, 2);
        Point b = new Point(3, 4);        
        
        Line ab = new Line(a, b);

        System.out.print("Линия AB = ");
        ab.print('A', 'B');
        System.out.println();

        //Треугольник
        Point c = new Point(5, 6);
        Triangle abc = new Triangle(a, b, c);

        System.out.print("Треугольник ABC = ");
        abc.print('A', 'B', 'C');
        System.out.println();

        //Квадрат
        Point d  = new Point(7, 8);
        Square abcd = new Square(a, b, c, d);

        System.out.print(" ABCD = ");
        abcd.print('A', 'B', 'C', 'D');
        System.out.println();

        //Прямоугольник
        Point e = new Point(1,1);
        Point f = new Point(4,  1);
        Point k = new Point(4, 2);
        Point g = new Point(1, 2);
        Rectangle efkg = new Rectangle(e, f, k, g);

        System.out.print(" EFKG = ");
           abcd.print('E', 'F', 'K', 'G');
        System.out.println();
    }
}
