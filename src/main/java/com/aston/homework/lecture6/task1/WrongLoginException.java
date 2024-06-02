package com.aston.homework.lecture6.task1;


/**
 * Класс исключения для login
 */
public class WrongLoginException extends Exception { 
    
    WrongLoginException() {

    }


    /**
     * Конструктор класса
     * 
     * @param message сообщение об ошибке
     */
    WrongLoginException(String message) {
        super("WrongLoginException : " + message);
    }

}
