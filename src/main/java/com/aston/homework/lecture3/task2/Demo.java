package com.aston.homework.lecture3.task2;

/**
 * 3.2 Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше средней, а также их длину.
 */
public class Demo {

    public static void main(String[] args) {
        
        CompareString compareString = new CompareString(3);
                
        compareString.printStringShorterThanAveragetLength();
    }
}