package com.aston.homework.lecture1.task4;

/**
* класс Line - линия
*/
public class Line {
    
    /**
     * точка A
     */
    private Point a;

     /**
     * точка B
     */
    private Point b;

    /**
     * Констурктор класса Line - линия
     * 
     * @param a точка A
     * @param b точка B
     */
    Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
    
    /**
     * Вывод линии Line в формате: A(x,y)B(x,y)
     * 
     * @param charPointA символ точки A
     * @param charPointB символ точки B
     */
    void print(char charPointA, char charPointB) {        
        a.print(charPointA);
        b.print(charPointB);
    }

    /**
     * Вывод линии Line в формате: A(x,y)B(x,y)
     * 
     * @param ab строка в которой 2 первых символа указывают на имя линии
     */
    void print(String ab) {
        if (ab.length() >= 2) {
            char a = ab.charAt(0);
            char b = ab.charAt(1);
            print(a, b);
        } else {
            System.out.println("Отрезок обозначается минимум двумя символами.");
        }
    }

    void print() {        
        a.print();
        b.print();
    }
}
