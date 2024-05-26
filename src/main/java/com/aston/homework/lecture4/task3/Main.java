package com.aston.homework.lecture4.task3;

import java.util.HashSet;

/**
 * 4.3 
 * 4.3.1 Создать класс Person.
 * 4.3.2 Создать HashSet в классе Main.
 * 4.3.3 Добавить к этому списку 3 объекта Person, вывести результат используя for each.* 
 * 4.3.4 Удалить 2 объекта из коллекции.
 * 4.3.5 Проверить, соержится ли оставшийся объект в коллекции.
 * 
 */
public class Main {

    private static HashSet<Person> personHashSet;

    
    /**
     * Вывести элементы коллекции personHashSet
     */
    public static void printPersonHashSet() {

        for (Person person : personHashSet) {
            System.out.println(person);
        }
    }

    public static void main(String[] args) {
        
        //Создать HashSet в классе Main.
        personHashSet = new HashSet<Person>();

        //Добавить к этому списку 3 объекта Person, вывести результат используя for each.* 
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        personHashSet.add(person1);
        personHashSet.add(person2);
        personHashSet.add(person3);
        System.out.println("\nЭлементы коллекции personHashSet после добавления 3 элементов:");
        printPersonHashSet();
        
        //Удалить 2 объекта из коллекции.
        System.out.println();
        personHashSet.remove(person1);
        personHashSet.remove(person3);
        System.out.println("\nЭлементы коллекции personHashSet после удаления 2 элементов:");
        printPersonHashSet();

        //Проверить, соержится ли оставшийся объект в коллекции.
        System.out.println("\nПрисутствует ли в  коллекции personHashSet элемент person2: " + personHashSet.contains(person2));
        
    }
}
