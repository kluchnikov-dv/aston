package com.aston.homework.lecture4.task2;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 4.2 
 * 4.2.1 Создать двусвязанный список стран мира.
 * 4.2.2 Добавить к этому списку 4 страны (2 в начало и 2 в конец), вывести результат на консоль (Использовать методы addFirst/addLast).
 * 4.2.3 Удалить по одному элементу из начала и из конца списка.
 * 4.2.4 Получить по одному элементу из начала и из конца списка.
 * 
 */
public class Demo {
    public static void main(String[] args) {
        
        //Создать двусвязанный список стран мира.
        LinkedList<String> countryLinkedList = new LinkedList<>(Arrays.asList("ЮАР", "Саудовская Аравия", "ОАЭ", "Эфиопия", "Египет"));

        System.out.println("\nСоздать двусвязанный список стран мира :");
        System.out.println(countryLinkedList);

        //Добавить к этому списку 4 страны (2 в начало и 2 в конец), вывести результат на консоль (Использовать методы addFirst/addLast).
        System.out.println("\nДобавить к этому списку 4 страны (2 в начало и 2 в конец), вывести результат на консоль (Использовать методы addFirst/addLast):"); 
        countryLinkedList.addFirst("Россия");
        countryLinkedList.addFirst("Китай");
        countryLinkedList.addLast("Бразилия");
        countryLinkedList.addLast("Индия");
        System.out.println(countryLinkedList);
        
        //Удалить по одному элементу из начала и из конца списка.
        System.out.println("\nУдалить по одному элементу из начала и из конца списка:");
        countryLinkedList.removeFirst();
        countryLinkedList.removeLast();
        System.out.println(countryLinkedList);

        //Получить по одному элементу из начала и из конца списка.
        System.out.println("\nПолучить по одному элементу из начала и из конца списка.");
        System.out.println("В начале списка: " + countryLinkedList.getFirst());
        System.out.println("В конце списка: " + countryLinkedList.getLast());
    }
}
