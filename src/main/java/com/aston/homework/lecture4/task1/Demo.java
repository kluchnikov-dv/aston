package com.aston.homework.lecture4.task1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 4.1 
 * 4.1.1 Создать коллекцию ArrayList стран мира.
 * 4.1.2 Добавить к этому списку 3 страны, вывести результат на консоль.
 * 4.1.3 Заменить 2-ой элемент.
 * 4.1.4 Удалить его по индексу.
 * 4.1.5 Удалить любой элемент по значению.
 * 4.1.6 Узнать индекс любого элемента.
 * 4.1.7 Проверить, содержится ли элемент в коллеции (любой).
 * 
 */
public class Demo {
    public static void main(String[] args) {
        
        ArrayList<String> countryArrayList = new ArrayList<String>(Arrays.asList("ЮАР", "Саудовская Аравия", "ОАЭ", "Эфиопия", "Египет"));
        
        System.out.println("Список стран при создании ArrayList:");
        System.out.println(countryArrayList);

        //Добавить 3 страны
        System.out.println("\nДобавить 3 страны:");
        countryArrayList.add("Россия");
        countryArrayList.add("Китай");
        countryArrayList.add("Индия");
        System.out.println(countryArrayList);

        //Заменить 2-ой элемиент
        System.out.println("\nЗаменить 2-ой элемиент:");
        countryArrayList.set(1, "Бразилия");
        System.out.println(countryArrayList);

        //Удалить 2-ой элемент по индексу
        System.out.println("\nУдалить 2-ой элемент по индексу:");
        countryArrayList.remove(1);
        System.out.println(countryArrayList);

        //Удалить любой элемент по значению
        System.out.println("\nУдалить любой элемент по значению:");
        countryArrayList.remove("Эфиопия");
        System.out.println(countryArrayList);

        //Узнать индекс любого элемента
        System.out.println("\nУзнать индекс любого элемента:");
        System.out.println("Индекс элемента \"Россия\": " + countryArrayList.indexOf("Россия")); 
        
        //Проверить, содержится ли  элемент в коллекции (любой)
        System.out.println("\nПроверить, содержится ли  элемент в коллекции (любой)");
        System.out.println("Китай: " + countryArrayList.contains("Китай"));
    }
}
