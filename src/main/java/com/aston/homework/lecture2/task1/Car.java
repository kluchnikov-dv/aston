package com.aston.homework.lecture2.task1;

/**
 * Car машина
 */
public abstract class Car implements Vehicle {
 
    /**
     * @return возвращает количество дверей
     */
    abstract int getNumberOfDoors();    
   
    /**
     * @return возвращает вместимость багажника или кузова
     */
    abstract int getTrunkCapacity();
}
