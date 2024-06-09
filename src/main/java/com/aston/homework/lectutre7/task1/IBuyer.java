package com.aston.homework.lectutre7.task1;

/**
 * Интерфейс покупателя
 */
public interface IBuyer {
    
    
    /**
     * вошел в магазин (мгновенно)
     */
    void enterToMarket(); 
    
    /**
     * выбрал товар (от 0,5 до 2 секунд)
     */
    void chooseGoods(); 
    
    /**
     * отправился на выход(мгновенно)
     */
    void goOut(); 
}
