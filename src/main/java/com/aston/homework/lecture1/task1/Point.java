package com.aston.homework.lecture1.task1;

public class Point {
        
    /**
     * координата x
     */
    private int x;
    
    /**
     * координата y
     */
    private int y;

    /**
     * @return получить x
     */
    public int getX() {
        return x;
    }

    /**
     * @param установить x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return получить y
     */
    public int getY() {
        return y;
    }

    /**
     * @param установить y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @param x координата X
     * @param y координата Y
     */
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    /**
     * @param pointChar символ точки
     */
    void print(char pointChar) {
        System.out.print(pointChar + "(" + x + "," + y + ") ");
    }
}
