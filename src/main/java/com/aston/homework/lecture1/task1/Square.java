package com.aston.homework.lecture1.task1;

public class Square {

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
     * точка D
     */
    private Point d;

    /**
     * @param a точка A
     * @param b точка B
     * @param c точка С
     * @param d точка D
     */ 
    Square(Point a, Point b, Point c, Point d) {         
        
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d; 
        
        //Обозначение квадрата точками против часовой стрелки
        if (a.getY() == b.getY() && b.getX() == c.getX() && c.getY() == d.getY() && d.getX() == a.getX() && (b.getX() - a.getX()) == (c.getY() - b.getY())) {                
            System.out.print("Это квадрат.");                      
        } else {
            System.out.print("Это не квадрат.");                
        }
    }

     /**
     * @param charPointA символ точки A
     * @param charPointB символ точки B
     * @param charPointC символ точки C
     * @param charPointD символ точки D
     */
    void print(char charPointA, char charPointB, char charPointC, char charPointD) {
        a.print(charPointA);
        b.print(charPointB);
        c.print(charPointC);
        d.print(charPointD);
    }
}
