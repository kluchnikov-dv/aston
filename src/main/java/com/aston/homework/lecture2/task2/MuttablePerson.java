package com.aston.homework.lecture2.task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Изменяемые объекты класса
 */
public class MuttablePerson {
    private String name;
    private int age;
    private List<String> hobbies;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public List<String> getHobbies() {
        return hobbies;
    }
    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }        

    //Инициализация полей в конструкторе
    MuttablePerson() {
        name = "Алексей";
        age = 18;
        hobbies = new ArrayList<String>();
        hobbies.add("Плавание");
        hobbies.add("Марки");
        hobbies.add("Кино");        
    }

    void print() {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("hobbies = " + hobbies);
    }
}
