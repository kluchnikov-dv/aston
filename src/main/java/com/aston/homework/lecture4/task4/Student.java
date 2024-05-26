package com.aston.homework.lecture4.task4;

import java.util.ArrayList;

/**
 * Класс Student
 */
public class Student {
    
    /**
     * Имя
     */
    private String name;


    /**
     *  Группа
     */
    private String group;


    /**
     *  Курс
     */
    private int course; 


    /**
     *  Средний бал
     */
    private int gpa; //grate point average    
    
    
    /**
     * Список предметов и оценка
     */
    private ArrayList<Subject> subjects = new ArrayList<Subject>();

    
    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getGroup() {
        return group;
    }


    public void setGroup(String group) {
        this.group = group;
    }


    public int getCourse() {
        return course;
    }


    public void setCourse(int course) {
        this.course = course;
    }


    public int getGpa() {
        return gpa;
    }


    public void setGpa(int gpa) {
        this.gpa = gpa;
    }


    public ArrayList<Subject> getSubjects() {
        return subjects;
    }


    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }


    Student(String name, String group, int course, ArrayList<Subject> subjects) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.subjects = subjects;
        gpa = calcGPA();
    }


    /**
     * @return Вычисляет и возвращает средний бал, только внутри класса. Вычисление происходит в конструкторе и присваивается полю gpa.
     */
    private int calcGPA() {
        
        int result = 0;
        for (Subject subject : subjects) {
            result += subject.getGrade();
        }
        return result / subjects.size();
    }
}
