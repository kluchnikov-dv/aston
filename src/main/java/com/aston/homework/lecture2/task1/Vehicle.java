package com.aston.homework.lecture2.task1;

/**
 * Vehicle транспортное средство
 */
public interface Vehicle {

    /**
     * start() запуск двигателя
     */
    void start();

    /**
     * start() остановка двигателя
     */
    void stop();
    
    /**
     * @return тип используемого топлива
     */
    String getFuelType();

}
