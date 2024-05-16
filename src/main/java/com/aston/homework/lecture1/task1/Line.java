package com.aston.homework.lecture1.task1;

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
     * @param a точка A
     * @param b точка B
     */
    Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
    
    /**
     * @param charPointA символ точки A
     * @param charPointB символ точки B
     */
    void print(char charPointA, char charPointB) {
        a.print(charPointA);
        b.print(charPointB);
    }
}
