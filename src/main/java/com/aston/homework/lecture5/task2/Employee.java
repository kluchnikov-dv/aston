package com.aston.homework.lecture5.task2;

/**
 * Класс - сотрудник
 */
public class Employee {
        
    /**
     * Имя
     */
    private String name;

    /**
     * Возраст
     */
    private int age;

    /**
     * Департамент
     */
    private String department;

    /**
     * Оклад
     */
    private int salary;

    
    /**
     * Конструктор класса  - сотрудник
     * 
     * @param name имя
     * @param age возраст
     * @param department департамент
     * @param salary оклад
     */
    public Employee(String name, int age, String department, int salary) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    
}
