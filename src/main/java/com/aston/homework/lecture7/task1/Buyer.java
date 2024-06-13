package com.aston.homework.lecture7.task1;

import java.util.Random;


/**
 * Класс - Покупатель
 */
public class Buyer implements IBuyer, IUseBasket, Runnable {

    private Thread thread;


    public Thread getThread() {
        return thread;
    }

    /**
     * Имя покупателя
     */
    private String name;


    /**
     * Корзина покупателя
     */
    private Basket basket;


    /**
     * Конструктор класса - Покупатель
     * 
     * @param name имя покупателя
     */
    Buyer(String name){
        
        this.name = name;
        basket = new Basket();
        thread = new Thread(this, name);
        thread.start();
    }
    
    @Override
    public void chooseGoods() {
        
        Random random = new Random();
        int numbersGoods = random.nextInt(4) + 1;
        try {
            basket.setChooseGoods(numbersGoods);
            int chooseTime = (int)((0.5 + random.nextDouble() * 2) * 1000);
            thread.sleep(chooseTime);
            System.out.println(name + " выбрал товар в колличестве " + numbersGoods + "шт.");
        } catch (InterruptedException e) {
            System.out.println("Поток c " + name + " прерван.");
        }
        
    }
    
    @Override
    public void enterToMarket() {
        
        System.out.println(name + " вошел в магазин.");        
    }
    
    @Override
    public void goOut() {

        System.out.println(name + " отправился на выход.");                
    }

    
    @Override
    public void putGoodsToBasket() {
        
        Random random = new Random();
        try {
            basket.putGoods();
            int chooseTime = (int)((0.5 + random.nextDouble() * 2) * 1000);
            thread.sleep(chooseTime);
            System.out.print(name + " положил товар в корзину: ");
            basket.printBasketGoods();
            System.out.println();

        } catch (InterruptedException e) {
            System.out.println("Поток c " + name + " прерван.");
        }     
    }
    
    @Override
    public void takeBasket() {

        Random random = new Random();
        try {
            
            int chooseTime = (int)((0.5 + random.nextDouble() * 2) * 1000);
            thread.sleep(chooseTime);
            System.out.println(name + " взял корзину. ");

        } catch (InterruptedException e) {
            System.out.println("Поток c " + name + " прерван.");
        }     
        
    }

    public void run() {

        enterToMarket();
        takeBasket();
        chooseGoods();
        putGoodsToBasket();
        goOut();
    }
    
}
