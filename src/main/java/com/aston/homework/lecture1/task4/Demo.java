package com.aston.homework.lecture1.task4;

/**
* 4. Реализуйте перегрузку методов в ваших классах и попробуйте вызвать разные версии перегруженных методов.
*/
public class Demo {
   
    public static void main(String[] args) {
        
        //Перегрузка конструкторов с различными параметрами по типу и колличеству
        Point a = new Point('A', 1, 1);
        Point b = new Point('B',2);
        Point c = new Point('C');
        Point d = new Point('D', b);        
        Point e = new Point('E', 3);
        Point f = new Point('F', 4);
        
        Line ab = new Line(a, b);
        Line cd = new Line(c, d);
        Line ef = new Line(e, f);

        //Перегрузка методов
        System.out.print("Линия: ");
        ab.print("AB");
        System.out.println();

        System.out.print("Линия: ");
        cd.print();
        System.out.println();

        System.out.print("Линия: ");
        ef.print('E', 'F');
        System.out.println();
    }
}
