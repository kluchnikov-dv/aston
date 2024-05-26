package com.aston.homework.lecture3.task4;

import java.util.Scanner;

/**
 * Сравнение строк.
 */
public class CompareString {
     
    /**
     * Массив слов.
     */
    private String[] stringArray;
    private StringBuilder resultString;

    private Scanner scanner = new Scanner(System.in);
    
    /**
     * @param numberOfString Колличество строк. Прочитать с консоли.
     */
    CompareString(int numberOfString) {        
        
        stringArray = new String[numberOfString];
        resultString = new StringBuilder();     

        System.out.println("Введите " +  numberOfString + " строки(-у,-ок):");
        for (int i = 0; i < stringArray.length; i++) {            
            stringArray[i] = scanner.nextLine();
        }

        scanner.close();        
    }
    
    /**
     * @return Возвращает задублированную строку
     */
    public String getStringWithDublicatedChar() {
    
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length(); j++) {                
                resultString.append(stringArray[i].charAt(j));
                resultString.append(stringArray[i].charAt(j));
            }
            resultString.append("\n");
        }    
        return resultString.toString();
    }

}
