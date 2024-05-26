package com.aston.homework.lecture3.task3;

/**
 * 3.2 Ввести 3 строки с консоли. Найти слово, состоящее только из различных симовлов.
 *     Если таких слов несколько, найти первое из них.
 * 
 *      Пример текста:
 *        Люблю тебя,       Петра творенье,
 *       Люблю твой строгий,       стройный вид,
 *           Невы      державное теченье,
 * 
 */
public class Demo {

    public static void main(String[] args) {
        
        CompareString compareString = new CompareString(3);
        
        System.out.println("\nСлово состоящее из различных симоволов: " + compareString.getWordsVariosChar());
    }
}