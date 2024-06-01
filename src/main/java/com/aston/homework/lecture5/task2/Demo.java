package com.aston.homework.lecture5.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 * 
 * Создать класс Employee с полями name, age, department, salary 
 * Вам нужно выполнить следующие задачи, используя стримы (каждый пункт в отдельном методе):
 * 1)  Создать список сотрудников.
 * 2)  Найти всех сотрудников старше 30 лет и отсортировать их по возрасту.
 * 3)  Посчитать общее количество сотрудников в отделе "IT".
 * 4)  Найти сотрудника с максимальной зарплатой.
 * 5)  Получить список имен всех сотрудников, работающих в отделе "HR", и отсортировать их по имени.
 * 6)  Рассчитать среднюю зарплату всех сотрудников.
 *
 */
public class Demo {

    static private List<Employee> employeesList = new ArrayList<>();
    
    /**
     * Создать список сотрудников.
     */
    private static void createEmployeesList() {

        employeesList.add(new Employee("Иванов Иван Иванович", 26, "Marketing", 250_000));
        employeesList.add(new Employee("Петров Иван Иванович", 43, "IT", 100_000));
        employeesList.add(new Employee("Александров Иван Иванович", 35, "HR", 150_000));
        employeesList.add(new Employee("Сергеев Евгений Иванович", 20, "IT", 200_000));
        employeesList.add(new Employee("Васильев Иван Иванович", 36, "HR", 300_000));
        employeesList.add(new Employee("Кузнецов Петр Иванович", 29, "IT", 580_000));
        employeesList.add(new Employee("Петров Андрей Иванович", 53, "Marketing", 180_000));
        employeesList.add(new Employee("Алексеев Иван Иванович", 19, "IT", 260_000));
        employeesList.add(new Employee("Андреев Иван Иванович", 32, "IT", 120_000));
        employeesList.add(new Employee("Иванов Сергей Иванович", 41, "Marketing", 180_000));        
    }
    
    /**
     * Вывести всех сотрудников
     */
    private static void printAllEmployees() {
       
        System.out.println("\nСписок всех сотрудников:");
        employeesList
            .stream()
            .forEach(value -> System.out.println(value.getName() + " " + value.getAge() + " " + value.getDepartment() + " " + value.getSalary()));
    }  


    /**
     * Найти всех сотрудников старше 30 лет и отсортировать их по возрасту.
     * 
     * @param yearsOld возраст
     */
    private static void printEmployeesOverYearsOldSortByAge(int yearsOld) {
        
        System.out.println("\nНайти всех сотрудников старше 30 лет и отсортировать их по возрасту:");
        employeesList
            .stream()
            .filter(value -> value.getAge() > yearsOld)
            .sorted(Comparator.comparing(Employee::getAge))
            .forEach(value -> System.out.println(value.getName() + " " + value.getAge()));
    }

    
    /**
     * Посчитать общее количество сотрудников в отделе "IT".
     * 
     * @param department департамент
     */
    private static void printEmployeesCountInDepartment(String department) {
       
        System.out.println("\nПосчитать общее количество сотрудников в отделе \"" + department + "\":");
        System.out.println(employeesList
                                .stream()
                                .filter(value -> value.getDepartment() == department).count());
    }

    
    /**
     * Найти сотрудника с максимальной зарплатой.
     */
    private static void printEmployeesMaxSalary() {
        
        System.out.println("\nНайти сотрудника с максимальной зарплатой:");
        Employee resultEmployee = employeesList
                                    .stream()
                                    .max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(resultEmployee.getName() + " " + resultEmployee.getSalary());        
    }

    
    
    /**
     * Получить список имен всех сотрудников, работающих в отделе "HR", и отсортировать их по имени.
     * 
     * @param department департамент
     */
    private static void printEmploeesFromDepartmentSortByName(String department) {
       
        System.out.println("\nПолучить список имен всех сотрудников, работающих в отделе \"HR\", и отсортировать их по имени:");
        employeesList
            .stream()
            .filter(value -> value.getDepartment() == department)
            .sorted(Comparator.comparing(Employee::getName))
            .forEach(value -> System.out.println(value.getName()));
    }
        

    /**
     * Рассчитать среднюю зарплату всех сотрудников.
     */
    private static void printEmployeesAvgSalary() {
      
        System.out.println("Рассчитать среднюю зарплату всех сотрудников:");
        System.out.println(employeesList
            .stream()
            .flatMapToInt(value -> IntStream.of(value.getSalary()))
            .average().getAsDouble());            

    }
    

    public static void main(String[] args) {

        //Создать список сотрудников.        
        createEmployeesList();
        
        //Вывести всех сотрудников
        printAllEmployees();        
        
        //Найти всех сотрудников старше 30 лет и отсортировать их по возрасту.                
        printEmployeesOverYearsOldSortByAge(30);
        
        //Посчитать общее количество сотрудников в отделе "IT".        
        printEmployeesCountInDepartment("IT");
        
        //Найти сотрудника с максимальной зарплатой.        
        printEmployeesMaxSalary();
        
        //Получить список имен всех сотрудников, работающих в отделе "HR", и отсортировать их по имени.        
        printEmploeesFromDepartmentSortByName("HR");

        //Рассчитать среднюю зарплату всех сотрудников.        
        printEmployeesAvgSalary();
    }
}
