package com.aston.homework.lecture8.task1;

/**
 * Дз за 06.06
 * 1. Добавить Maven либо Gradle в проект
 * 
 * 2. Создать новую ветку dev, и переключиться на неё. 
 * 
 * Сделать слияние новой ветки в master ветку. 
 * 
 * В обоих ветках в одинаковых местах создать похожий код(имитация конфликта) и попытаться смержить ветки снова. 
 * Решить merge конфликт.
 */
public class Demo {

    public static void main(String[] args) {

        System.out.println("merge Hello world.");
        Temp temp = new Temp("merge temp");
        System.out.println(temp.getName());
    }    
}
