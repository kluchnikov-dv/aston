package com.aston.homework.lecture3.task1;

/**
 * 3.1 Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
 *     Вывести найденные строки и их длину.
 */
public class Demo {

    public static void main(String[] args) {
        
        CompareString compareString = new CompareString(4);

        System.out.println("\nЭто самая длинная строка, в ней " + compareString.getLongestString().length() + " сивола(-ов):");
        System.out.println(compareString.getLongestString());
        System.out.println("\nЭто самая короткая строка, в ней " + compareString.getShortestString().length() + " сивола(-ов):");
        System.out.println(compareString.getShortestString());
    }
}