package com.aston.homework.lecture1.task2;

/**
* класс Point - точка
*/
public class Point {
        
    /**
     * координата x точки Point
     */
    static int x = 1;
    
    /**
     * координата y точки Point
     */
    static int y = 1;    

    //статический блок инициализации
    static {
        System.out.println("Как только загружается класс Point, выполняются статические операторы, значения координат точки: A(" + x + "," + y + ")");
        x = y = 2;
        System.out.println("Далее выполняется статический блок класса Point, значения координат точки: A(" + x + "," + y + ")");
    }

    //не статический блок инициализации
    {
        x = y = 4;
    }

    /**
     * Вывод координат точки Point,в формате: A(x,y)
     * 
     * @param pointChar символ точки
     */
    static void print(char pointChar) {
        System.out.print(pointChar + "(" + x + "," + y + ") ");
    }
}

