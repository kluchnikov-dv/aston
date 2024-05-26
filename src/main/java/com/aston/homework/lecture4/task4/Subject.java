package com.aston.homework.lecture4.task4;

/**
 * Предмет
 */
public class Subject {
    
    /**
     * Название предмета
     */
    private String name;
    
    /**
     * Оценка по предмету
     */
    private int grade;

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getGrade() {
        return grade;
    }


    public void setGrade(int grade) {
        this.grade = grade;
    }

    Subject(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
}
