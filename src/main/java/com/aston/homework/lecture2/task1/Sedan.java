package com.aston.homework.lecture2.task1;

/**
 * Класс  Sedan седан
 */
class Sedan extends Car {

    @Override
    public void start() {
        System.out.println("Запуск двигателя седана.");
    }

    @Override
    public void stop() {
        System.out.println("Остановка двигателя седана.");
    }

    @Override
    public String getFuelType() {
        return "бензин";
    }

    @Override
    int getNumberOfDoors() {
        return 5;
    }

    @Override
    int getTrunkCapacity() {
       return 500;
    }
    
    /**
     * @return возвращает уровень класса sedana A, B, C, D
     */
    String getLuxuryLevel(int level) {
        switch(level){
            case (1): return "A - класс";
            case (2): return "B - класс";
            case (3): return "C - класс";
            case (4): return "D - класс";
        default:
            return "Нет такого класса авто для седана.";
        }
    }
}
