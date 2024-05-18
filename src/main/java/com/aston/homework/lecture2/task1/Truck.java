package com.aston.homework.lecture2.task1;

/**
 * Класс  Truck грузовик
 */
public class Truck extends Car {

    @Override
    public void start() {
        System.out.println("Запуск двигателя грузовика.");
    }

    @Override
    public void stop() {
        System.out.println("Остановка двигателя грузовика.");
    }

    @Override
    public String getFuelType() {
        return "дизельное топливо";
    }

    @Override
    int getNumberOfDoors() {
        return 2;
    }

    @Override
    int getTrunkCapacity() {
        return 18000;
    }

    /**
     * @return возвращает максимальную грузоподъёмность
     */
    int getMaxLoadCapacity() {
        return 1500;
    }
    
}
