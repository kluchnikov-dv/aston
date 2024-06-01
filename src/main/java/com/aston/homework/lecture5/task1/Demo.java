package com.aston.homework.lecture5.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
 * Stream'ов:
 *  - Удалить дубликаты
 *  - Оставить только четные элементы
 *  - Вывести сумму оставшихся элементов в стриме
 */
public class Demo {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(11, 2, 3, 24, 22,  52, 62, 6,  77, 77, 5, 9, 10, 12, 12, 5));
        
        //Изначальный список элементов
        System.out.println("\nСписок присутствующих элементов:");
        arrayList.stream().forEach(value -> System.out.print(value + " "));        
        System.out.println("\n");

        //Удалить дубликаты
        System.out.println("Удалили дубликаты:");
        arrayList = arrayList.stream().distinct().toList();
        arrayList.stream().forEach(value -> System.out.print(value + " "));        
        System.out.println("\n");

        //Оставляем только четные элементы
        System.out.println("Оставляем только четные элементы:");
        arrayList = arrayList.stream().filter(value -> value % 2 == 0).toList();
        arrayList.stream().forEach(value -> System.out.print(value + " "));        
        System.out.println("\n");
       
        //Вывести сумму оставшихся элементов в стриме
        System.out.println("Вывести сумму оставшихся элементов в стриме: ");
        System.out.println(arrayList.stream().reduce(0, (x, y) -> x + y));
        

    }
}
