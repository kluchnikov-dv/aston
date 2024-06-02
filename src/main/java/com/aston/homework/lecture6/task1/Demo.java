package com.aston.homework.lecture6.task1;

import java.util.Scanner;

/**
 * Создать класс, в котором будет статический метод. 
 * Этот метод принимает на вход три параметра: login, password, confirmPassword. 
 * Все поля имеют тип данных String. 
 * Длина login должна быть меньше 20 символов и не должен содержать пробелы. 
 * Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException.
 * Длина password должна быть меньше 20 символов, не должен содержать пробелом и должен
 * содержать хотя бы одну цифру. 
 * Также password и confirmPassword должны быть равны.
 * Если password не соответствует этим требованиям, необходимо выбросить WrongPasswordException. 
 * +
 * Login + Password не должен быть пустым или null.
 * +
 * WrongPasswordException и WrongLoginException 
 * - пользовательские классы исключения с двумя конструкторами 
 * – один по умолчанию, второй принимает сообщение исключения и передает его в конструктор класса Exception.
 * 
 * Метод возвращает true, если значения верны, false в противном случае.
 */
public class Demo {
    
    /**
     * логин
     */
    private static String login;

    /**
     * пароль
     */
    private static String password;

    /**
     * повтор пароля
     */
    private static String confirmPassword;


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        do {            
            System.out.print("\nВведите login: ");
            login = scanner.nextLine();

            System.out.print("Введите пароль: ");
            password = scanner.nextLine();

            System.out.print("Повторите пароль: ");
            confirmPassword = scanner.nextLine();
            
        } while (checkAccountRegistration(login, password, confirmPassword) == false);

        System.out.println("OK.");

        scanner.close();
    }

    /**
     * Проверить валидность логина и пароля
     * 
     * @param login логин
     * @param password пароль
     * @param confirmPassword повтор пароля
     * @return  Возвращает true, если логин и пароль валидны, иначе false
     */
    public static  boolean checkAccountRegistration(String login, String password, String confirmPassword) {    
        
        //Длина login должна быть меньше 20 символов
        if (login.length() > 20)
            try {
                throw new WrongLoginException("Длина login должна быть меньше 20 символов.");
            } catch (WrongLoginException e) {                
                System.out.println(e.getMessage());
                return false;          
            }        
        
        //Login не должен содержать пробелы
        if (login.indexOf(' ') != -1)
            try {
                throw new WrongLoginException("Login не должен содержать пробелы.");
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
                return false;          
            }

        //Login не должен быть пустым или null
        if (login.isEmpty())
            try {
                throw new WrongLoginException("Login не должен быть пустым или null.");
            } catch (WrongLoginException e) {
                System.out.println(e.getMessage());
                return false;          
            }

        //Длина password должна быть меньше 20 символов
        if (password.length() > 20)
            try {
                throw new WrongPasswordException("Длина password должна быть меньше 20 символов.");
            } catch (WrongPasswordException e) {                
                System.out.println(e.getMessage());
                return false;          
            }        
        
        //Password не должен содержать пробелы
        if (password.indexOf(' ') != -1)
            try {
                throw new WrongPasswordException("Password не должен содержать пробелы.");
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
                return false;          
            }
        
        //Password не должен быть пустым или null
        if (password.isEmpty())
        try {
            throw new WrongPasswordException("Password не должен быть пустым или null.");
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;          
        }
        
          
        //Password должен содержать хотя бы одну цифру
        if (!password.matches(".*\\d.*")) 
            try {
                throw new WrongPasswordException("Password должен содержать хотя бы одну цифру.");
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
                return false;          
            }
        
        //Также password и confirmPassword должны быть равны.
        if (!password.equals(confirmPassword))
            try {
                throw new WrongPasswordException("Password и ConfirmPassword должны быть равны.");
            } catch (WrongPasswordException e) {
                System.out.println(e.getMessage());
                return false;          
            }
    
        return true;   
    }
}
