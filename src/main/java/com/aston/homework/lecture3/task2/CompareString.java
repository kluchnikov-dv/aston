package com.aston.homework.lecture3.task2;

import java.util.Scanner;

/**
 * Сравнение строк.
 */
public class CompareString {
     
    /**
     * Массив из 3-х строк
     */
    private  String[] stringArray;
    

    /**
     * @param numberOfString Колличество строк, которые необходимо сравнить. Прочитать с консоли.
     */
    CompareString(int numberOfString) {        
        stringArray = new String[numberOfString];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите " +  numberOfString + " строки(-у,-ок):");
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = scanner.nextLine();
        }
        scanner.close();
    }

    
    /**
     * @return Возвращает среднее число символов в массиве строк
     */
    private int getAverageNumberCharInStrings() {
        
        int sum = 0;
        
        for (int i = 0; i < stringArray.length; i++) {
            sum += stringArray[i].length();
        }

        return (sum / stringArray.length);        
    }    

    /**
     * Выводит строки, длина которых меньше средней:
     */
    public void printStringShorterThanAveragetLength() {
        
        int average = getAverageNumberCharInStrings();      
        System.out.println("\nСтроки, длина которых меньше средней " + average + " сивола(-ов):");  
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() < average) System.out.println("Длина строки " + stringArray[i].length() + " сивола(-ов): " + stringArray[i]);
        }
    }
}
