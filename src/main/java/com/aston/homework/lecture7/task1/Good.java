package com.aston.homework.lecture7.task1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;


/**
 * Класс - Товар
 */
public class Good {
    
    
    /**
     * Наименование товара
     */
    private String name;    

    /**
     * Цена товара
     */
    private int price;
    
  
    /**
     * Фиксированый спсиок с ценой для товаров
     */
    private HashMap<String, Integer> listPrice = new HashMap<String, Integer>(){{
        put("Яблоки", 150);
        put("Огурцы", 100);
        put("Груши", 300);
        put("Помидоры", 250);
        put("Капуста", 150);
        put("Картошка", 190);
        put("Лук", 300);
        put("Дыня", 350);
        put("Арбуз", 150);
        put("Айва", 200);
    }};

    /**
     * Конструктор класса - Товар
     */
    Good() {

        //Случайное занчение от 1 до 10 для получения элемента из фиксированного списка товаров
        Random random = new Random();
        int getNumberElement = random.nextInt(10) + 1;         
        
        //Случайно выбераем значение полей для товара из фиксированного списка 
        Iterator<Map.Entry<String, Integer>> iterator = listPrice.entrySet().iterator();
        while (iterator.hasNext() && getNumberElement != 0) {
            Map.Entry<String, Integer> entry = iterator.next();
            name = entry.getKey();
            price = entry.getValue();
            getNumberElement--;
        }
              
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
