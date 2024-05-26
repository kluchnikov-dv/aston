package com.aston.homework.lecture3.task3;

import java.util.Scanner;

/**
 * Сравнение строк.
 */
public class CompareString {
     
    /**
     * Массив слов.
     */
    private String[] stringArray;
    private String[] words;

    private Scanner scanner = new Scanner(System.in);
    private Scanner scannerWords;
    
    /**
     * @param numberOfString Колличество строк. Прочитать с консоли.
     */
    CompareString(int numberOfString) {        
        
        stringArray = new String[numberOfString];        

        System.out.println("Введите " +  numberOfString + " строки(-у,-ок):");
        for (int i = 0; i < stringArray.length; i++) {            
            stringArray[i] = scanner.nextLine();
        }

        words = new String[getNumberOfWords()];
        
        //заполняем массив слов
        int j = 0;
        for (int i = 0; i < stringArray.length; i++) {
            scannerWords = new Scanner(stringArray[i].trim());
            scannerWords.useDelimiter("\\s* |,\\s*"); //Выделяем слова, убираем пробелы и запятые  
            while(scannerWords.hasNext()) {
                words[j++] = scannerWords.next();
            }
            scannerWords.close();
        }
    
        scanner.close();        
    }


    /**
     * @return Возвращает колличество слов в строках
     */
    private  int getNumberOfWords() {
        
        int result = 0;       
        
        for (int i = 0; i < stringArray.length; i++) {
            scannerWords = new Scanner(stringArray[i].trim());
            scannerWords.useDelimiter("\\s* |,\\s*"); //Выделяем слова, убираем пробелы и запятые
            while(scannerWords.hasNext()) {
                scannerWords.next();
                result++;
            }
            scannerWords.close();
        }
        return result;
    }

    
    /**
     * @return Возвращает первое слово в веденных строках, состоящее из различных символов.
     */
    public String getWordsVariosChar() {
        
        boolean nextWord = false;

        for (int i = 0; i < words.length; i++) { //По словам
            for (int j = 0; j < words[i].length(); j++) { //По первому символу
                for (int k = (j + 1); k < words[i].length(); k++) { //С оставшимися символами
                    if (words[i].charAt(j) == words[i].charAt(k)) {
                        nextWord = true;
                        break;
                    }
                }
                if (nextWord == true) break;
            }
            if (nextWord == false) return words[i];
            nextWord = false;
        }
        return null;
    }
    
}
