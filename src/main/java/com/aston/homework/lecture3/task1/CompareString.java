package com.aston.homework.lecture3.task1;

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
     * @param numberOfString Колличество строк, которые необходимо сравнить
     */
    CompareString(int numberOfString) {        
        stringArray = new String[numberOfString];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите " +  numberOfString + " строки(-у,-ок):");
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = scanner.nextLine();
        }
    }
    
    /**     
     * @return Возвращает самую длинную строку из переданного массива строк
     */
    public String getLongestString() {

        if (stringArray == null) {
            System.out.println("Массив строк пуст.");
            System.exit(0);
        };  

        int indexLongest = 0;
        for (int i = 1; i < stringArray.length; i++) {
            if (stringArray[indexLongest].length() < stringArray[i].length()) indexLongest = i;
        }
        return stringArray[indexLongest];
    }

    
    /**     
     * @return Возвращает самую короткую строку из переданного массива строк
     */
    public String getShortestString() {
        
        if (stringArray == null) {
            System.out.println("Массив строк пуст.");
            System.exit(0);
        };  

        int indexShortes = 0;
        for (int i = 1; i < stringArray.length; i++) {
            if (stringArray[indexShortes].length() > stringArray[i].length()) indexShortes = i;
        }
        return stringArray[indexShortes];
    }   
}
