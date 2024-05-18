package com.aston.homework.lecture1.task4;

/**
* класс Point - точка
*/
public class Point {
     
    /**
     * Символ обозначающий точку
     */
    private char pointChar = '?'; 

    /**
     * координата x точки Point
     */
    private int x;
    
    /**
     * координата y точки Point
     */
    private int y;

    /**
     * Установить значение cимвола точки pointChar
     * 
     * @param установить pointChar
     */
    public void setPointChar(char pointChar) {
        this.pointChar = pointChar;
    }

    /**
     * Получить значение символа точки pointChar
     * 
     * @return получить pointChar
     */
    public char getPointChar() {
        return pointChar;
    }


    /**
     * Получить значение координаты х точки Point
     * 
     * @return получить x
     */
    public int getX() {
        return x;
    }

    /**
     * Установить значение координаты х точки Point
     * 
     * @param установить x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Получить значение координаты y точки Point
     * 
     * @return получить y
     */
    public int getY() {
        return y;
    }

    /**
     * Установить значение координаты y точки Point
     * 
     * @param установить y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Установить значение координат x и y точки Point
     * 
     * @param установить x и y
     */
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Конструктор точки Point по умолчанию, назначит координатам x и у значение 0 
     */
    Point() {
        this.x = this.y = 0;
    }

    /**
     * Констурктор класса Point - точка
     * 
     * @param x координата X
     * @param y координата Y
     */
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Констурктор класса Point - координаты x и y совпадают
     * 
     * @param xy координаты x и y
     */
    Point(int xy) {
        this.x = this.y = xy;
    }
    
    /**
     * Констурктор класса Point - копирует координаты x и y переданного экзмепляра класса Point
     * 
     * @param pointChar символ точки
     * @param p экзмепляр класса Point
     */
    Point(char pointChar, Point p) {
        this.pointChar = pointChar;
        this.x = p.x;
        this.y = p.y;
    }

    /**
     * Конструктор класса Point - точка
     * 
     * @param pointChar символ точки
     * @param x - координата X
     * @param y - координата Y
     */
    Point(char pointChar, int x, int y) {
        this.pointChar = pointChar;
        this.x = x;
        this.y = y;    
    }

    /**
     * Констурктор класса Point - координаты x и y совпадают плюс символ точки
     * 
     * @param pointChar символ точки
     * @param xy координаты x и y
     */
    Point(char pointChar, int xy) {
        this.pointChar = pointChar;
        this.x = this.y = xy;    
    }

    /**
    * Констурктор класса Point, назначит координатам x и у значение 0
    * 
    * @param pointChar символ точки
    */
    Point(char pointChar) {
        this.pointChar = pointChar;
        this.x = this.y = 0;
    }

    /**
     * Вывод координат точки Point,в формате: A(x,y)
     * 
     * @param pointChar символ точки
     */
    void print(char pointChar) {
        System.out.print(pointChar + "(" + x + "," + y + ") ");
    }

    /**
     * Вывод координат точки Point, в формате: A(x,y)
     */
    void print() {
        System.out.print(pointChar + "(" + x + "," + y + ") ");
    }
}
