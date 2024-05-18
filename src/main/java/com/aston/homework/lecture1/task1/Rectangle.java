package com.aston.homework.lecture1.task1;

/**
* класс Rectangle - прямоугольник
*/
public class Rectangle {
    
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
     * Конструктор класса Rectanlge - прямогугольник, точками против часовой стрелки
     * 
     * @param a точка A
     * @param b точка B
     * @param c точка С
     * @param d точка D
     */ 
    Rectangle(Point a, Point b, Point c, Point d) {                
        
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;   

        //Проверить, прямоугольник ли это
        if (a.getY() == b.getY() && b.getX() == c.getX() && c.getY() == d.getY() && d.getX() == a.getX()) {
            System.out.print("Это прямоугольник.");
        } else {
                System.out.print("Это не прямоугольник.");
        }
    }

    /**
     * Вывод точек прямоуголника Rectanlge в формате: A(x,y)B(x,y)C(x,y)D(x,y)
     * 
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
