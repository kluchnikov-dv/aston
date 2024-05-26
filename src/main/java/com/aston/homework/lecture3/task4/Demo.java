package com.aston.homework.lecture3.task4;

/**
 * 3.4 Вывести на консоль новую строку, которой задублирована каждая буква из 
 *     начальной строки. Например, "Hello" -> "HHeelloo".
 * 
 *     Пример текста:
 *        Люблю тебя,       Петра творенье,
 *       Люблю твой строгий,       стройный вид,
 *           Невы      державное теченье,
 * 
 */
public class Demo {

    public static void main(String[] args) {
        
        CompareString compareString = new CompareString(3);        
        System.out.println("\n" + compareString.getStringWithDublicatedChar());
    }
}