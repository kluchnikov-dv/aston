package com.aston.homework.lecture7.task1;

import java.util.ArrayList;

/**
 * Класс - Корзина
 */
public class Basket {
    
    /**
     * Колличество позиций товара в корзине
     */
    private int chooseGoods;

    
    /**
     * Непосредсвтенно товар находящийся  в корзине
     */
    private ArrayList<Good> goods = new ArrayList<>();
    

    
    /**
     * Поместить случайны товар в корзину
     */
    public void putGoods() {        
        for (int i = 0; i < chooseGoods; i++) {
            goods.add(new Good());   
        }        
    }    

    /**
     * Установить колличество позиций товара в корзине (покупатель выбрал товар)
     * 
     * @param chooseGoods колличество позиций товара в корзине
     */
    public void setChooseGoods(int chooseGoods) {
        this.chooseGoods = chooseGoods;
    }
    

    /**
     * Вывести товар имеющийся в корзине
     */
    void printBasketGoods() {
        for (int i = 0; i < goods.size() ; i++) {
            System.out.print(goods.get(i).getName() + "-" + goods.get(i).getPrice() + "руб. ");
        }
    }
}
