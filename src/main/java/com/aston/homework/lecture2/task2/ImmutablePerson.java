package com.aston.homework.lecture2.task2;

import java.util.Arrays;
import java.util.List;

/**
 * Не изменяемые объекты класса
 */
public class ImmutablePerson {
    private final String name;
    private final int age;
    private final List<String> hobbies;   

    //Инициализация полей в конструкторе
    ImmutablePerson() {
        name = "Иван";
        age = 30;
        hobbies = Arrays.asList("Бег", "Туризм", "Рыбалка");                    
    }

    void print() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("hobbies = " + hobbies);
    }
}
