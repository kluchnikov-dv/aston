package com.aston.homework.lecture6.task1;

/**
 * Класс исключения для password
 */
public class WrongPasswordException extends Exception{
    
    WrongPasswordException() {

    }

    /**
     * Конструктор класса 
     * 
     * @param message Сообщение об ошибке
     */
    WrongPasswordException(String message) {
        super("WrongPasswordException : " + message);
    }
}
