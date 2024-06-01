package com.aston.homework.lecture4.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * 4.4 Создать класс Student, содержащий следующие характеристики - имя, группа, курс, оценки по предметам.
 *     Создать коллекцию, содержащую объекты класса Student.
 *     Написать метод, который удаляет студентов со средним балом < 3.
 *     Если средний балл >= 3, студент переводится на следующий курс.
 *     Дополнительно написать метод printStudents(List<Student> students, int course), который получает список студентов и номер курса.
 *     А также печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.
 */
public class Demo {

    private static LinkedList<Student> students;

    /**
     * Статический блок инициализации
     */
    static {
        ArrayList<Subject> subjectsForStudent1 = new ArrayList<Subject>(Arrays.asList(new Subject("Математика", 5),
            new Subject("Физика", 4),
            new Subject("История", 4),
            new Subject("Философия", 5)));

        ArrayList<Subject> subjectsForStudent2 = new ArrayList<Subject>(Arrays.asList(new Subject("Математика", 3),
            new Subject("Физика", 4),
            new Subject("История", 3),
            new Subject("Философия", 5)));

        ArrayList<Subject> subjectsForStudent3 = new ArrayList<Subject>(Arrays.asList(new Subject("Математика", 3),
            new Subject("Физика", 4),
            new Subject("История", 3),
            new Subject("Философия", 1)));

        ArrayList<Subject> subjectsForStudent4 = new ArrayList<Subject>(Arrays.asList(new Subject("Математика", 3),
            new Subject("Физика", 4),
            new Subject("История", 4),
            new Subject("Философия", 5)));

        ArrayList<Subject> subjectsForStudent5 = new ArrayList<Subject>(Arrays.asList(new Subject("Математика", 1),
            new Subject("Физика", 4),
            new Subject("История", 2),
            new Subject("Философия", 3)));

        Student student1 = new Student("Иванов Иван Иванович", "42-22", 2, subjectsForStudent1);
        Student student2 = new Student("Петров Иван Иванович", "42-21", 3, subjectsForStudent2);
        Student student3 = new Student("Александров Иван Иванович", "42-20", 4, subjectsForStudent3);
        Student student4 = new Student("Сергеев Иван Иванович", "42-21", 3, subjectsForStudent4);
        Student student5 = new Student("Васильев Иван Иванович", "42-23", 1, subjectsForStudent5);

        students = new LinkedList<Student>(Arrays.asList(student1, student2, student3, student4, student5));
    }


    /**
     * Удаляет студентов со средним балом < 3.
     * Если средний балл >= 3, студент переводится на следующий курс.
     */
    public static void removeStudentsLowGPA() {

        // for(int i = 0; i < students.size(); i++) {
        //     if (students.get(i).getGpa() < 3) students.remove(i);
        //     else students.get(i).setCourse(students.get(i).getCourse() + 1);
        // }
        
        // Другой способ
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getGpa() < 3) iterator.remove();
        }
    }


    /**
     * Выводит имена студентов заданного курса
     * @param students Список студентов
     * @param course Курс
     */
    public static void printStudents(List<Student> students, int course) {
        for (Student student : students) {
            if (student.getCourse() == course) System.out.println(student.getName());
        }
    }


    /**
     * Вывести всех студентови информацию о них
     */
    public static void printAllStudents() {
        for (Student student : students) {
            System.out.print(student.getGroup() + " " + student.getName() + " курс: " + student.getCourse() + " средний бал:" + student.getGpa() + "\n");
            for (Subject subject : student.getSubjects()) {
                System.out.println("            " + subject.getName() + " " + subject.getGrade());
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("\nВсе студенты и их данные:");
        printAllStudents();

        System.out.println("\nУдаляем всех студентов у кого оценка ниже 3 балов, остальных переводим на следующий курс:");
        removeStudentsLowGPA();
        printAllStudents();

        System.out.println("\nИмена студентов 3 курса:");
        printStudents(students, 3);
    }
}
