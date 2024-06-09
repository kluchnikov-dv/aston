package com.aston.homework.lectutre7.task1;

import java.util.ArrayList;
import java.util.Random;

/**
 * Задача1
 * Напишите программу, моделирующую поток покупателей Buyer в магазине.
 * 
 * Каждую секунду в магазин приходят от 0 до 2 новых покупателей в течение двух минут.
 * 
 * Каждый покупатель реализует интерфейс IBuyer
 * public interface IBuyer {
 *  void enterToMarket(); //вошел в магазин (мгновенно)
 *  void chooseGoods(); //выбрал товар (от 0,5 до 2 секунд)
 *  void goOut(); //отправился на выход(мгновенно)
 * }
 * 
 * Доработайте программу так, чтобы:
 * 
 * Каждый покупатель реализовал интерфейс IUseBasket
 * public interface IUseBasket {
 *   void takeBasket(); //взял корзину
 *   void putGoodsToBasket(); //положил выбранный товар в корзину
 * }
 * 
 * У каждого покупателя с корзиной (Basket) собирается набор от 1..4 товаров (Good) из
 * фиксированного списка с ценой (рекомендуется hashmap, где товар – key, цена – value).
 * 
 * Время на каждую операцию от 0,5 до 2 секунд, итог операции – в консоль.
 */
public class Demo {

    /**
     * Как долго работал магазин
     * 
     * @param args время в "мс"
     */
    final static long HOW_LONG_STORE_OPEN = 120_000;


    /**
     * Список всех покупателей зашедших в магазин
     */
    private static ArrayList<Buyer> listBuyers = new ArrayList<>();

    public static void main(String[] args) {
                
        long startTime = System.currentTimeMillis(); //начало работы магазина

        int count = 1;

        Random random = new Random();        

        do {

            try {
                
                //В мазагин одновременно приходит от 0 до 2 покупателей
                int numbersBuyers = random.nextInt(3);
                if (numbersBuyers == 0) System.out.println("В эту секеунду покупатель не пришел.");
                
                for (int i = 0; i < numbersBuyers; i++) {
                    listBuyers.add(new Buyer("Покупатель " + count++));
                }
                
                //Приходят каждую секунду
                Thread.sleep(1000); 

            } catch (InterruptedException e) {
                System.out.println("Прерван главный поток.");
            }
                                    
        } while ((System.currentTimeMillis() - startTime) < HOW_LONG_STORE_OPEN);
        
        try {
            for (int i = 0; i < listBuyers.size(); i++) {
                listBuyers.get(i).getThread().join();
            }
        } catch (InterruptedException e) {
            System.out.println("Прерван главный поток.");
        }
        System.out.println("Главный поток завершен.");
    }
}
