package com.aston.homework.lecture1.task1;

public class Triangle {
    
        
    /**
     * точка A
     */
    private Point a;

        
    /**
     * точка B
     */
    private Point b;

    /**
    * точка C
     */
    private Point c;

    
    /**
     * @param a точка A
     * @param b точка B
     * @param c точка С
     */
    Triangle (Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * @param charPointA символ точки A
     * @param charPointB символ точки B
     * @param charPointC символ точки C
     */
    void print(char charPointA, char charPointB, char charPointC) {
        a.print(charPointA);
        b.print(charPointB);
        c.print(charPointC);
    }
}
