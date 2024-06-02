package com.aston.homework.lecture6.task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * Используя FileOutputStream и FileInputStream записать в файл tms.txt строку, введенную
 * пользователем с консоли. Считать строку из файла tms.txt и вывести в консоль, заменив
 * все пробелы на знак нижнего подчеркивания.
 */
public class Demo {

    private static String inputLine = null;

    private static final String PATH = ".//tms.txt";


    /**
     * Возвращает строку из консоли
     * 
     * @return строка из консоли
     */
    private static String readLine() {

        Scanner scanner = new Scanner(System.in);
        //Вводим строку в консоль
        System.out.println("Введите строку: ");
        String result =  scanner.nextLine();
        scanner.close();
        return result;
    }


    /**
     * Записать строку в файл
     * 
     * @param inputLine строка
     * @param fileName имя файла
     */
    private static void writeLineToFile(String inputLine, String fileName) {
        
        //Записываем строку в файл
        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
            
            byte[] buffer = inputLine.getBytes();            
            outputStream.write(buffer, 0, buffer.length);

        } catch (FileNotFoundException e) {
            
            System.out.println("Файл не найден.");

        } catch (IOException e) {

            System.out.println("Ошибка ввода вывода в файл.");

        }
    }


    /**
     * Вернуть строку из файла, заменив все пробелы на знак нижнего подчеркивания.
     * 
     * @param fileName имя файла
     * @return строка
     */
    private static String readLineFromFile(String fileName) {
        
        byte[] outputString = new byte[1024];

        try (FileInputStream inputStream = new FileInputStream(fileName)){
            
            int charCode;
            int i = 0;
            
            //Иначе проблема с кодировкой при чтении из файла
            while ((charCode = inputStream.read()) != -1) {
                if ((byte)charCode == ' ') outputString[i++] = '_';
                else outputString[i++] = (byte)charCode;                                
            }

            return new String(outputString);

        } catch (FileNotFoundException e) {            
            
            System.out.println("Файл не найден.");
            return null;

        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода в файл.");
            return null;
        }
    }


    public static void main(String[] args) {        
        
        // прочитать строку из консоли
        inputLine = readLine();

        // записать строку в файл
        writeLineToFile(inputLine, PATH);

        //Вывести строку
        System.out.println(readLineFromFile(PATH));
    }
}
