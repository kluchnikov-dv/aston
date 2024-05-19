package com.aston.homework.lecture2.task2;

import java.util.Arrays;

/**
 * 2.2 Создайте класс ImmutablePerson с полями String name, int age, List<String> hobbies. Создайте класс
 *     MuttablePerson с такими же полями (String name, int age, List<String> hobbies). Создайте класс Runner и 
 *     проверьте изменяемлсть и неизменяемость объектов.
 */
public class Runner {
    public static void main(String[] args) {
        System.out.println("Не изменяемый объект:");
        ImmutablePerson immutablePerson = new ImmutablePerson();
        immutablePerson.print();
        System.out.println();  

        System.out.println("Изменяемый объект:");
        MuttablePerson muttablePerson = new MuttablePerson();
        muttablePerson.print();
        System.out.println();        
        muttablePerson.setName("Иван");
        muttablePerson.setAge(30);
        muttablePerson.setHobbies(Arrays.asList("Бег", "Туризм", "Рыбалка"));
        System.out.println("Поля изменяемого объекта после изменения:");
        muttablePerson.print();
    }
}
