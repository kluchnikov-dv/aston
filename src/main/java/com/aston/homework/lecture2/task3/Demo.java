
package com.aston.homework.lecture2.task3;

/**
 * 2.3 Создайте класс Computer c вложенным статическим классом Processor и внутренним классом RAM. В классе
 *     Processor создайте поле model и метод getDatails(), который возвращает строку с моделью процессора. В
 *     классе RAM создайте поле size и метод getDatails(), который возвращает строку с размером RAM.
 */
public class Demo {
    public static void main(String[] args) {
        
        //Создание объекта статического вложенного класса
        Computer.Processor processor = new Computer.Processor("AMD Ryzen 9 7950X");
        System.out.println(processor.getDetails());

        //Создание внешнего объекта
        Computer computer = new Computer();
        //Создание объекта внутреннего нестатического вложенного класса, после обязательного создания внешнего
        Computer.RAM ram = computer.new RAM("32GB");
        System.out.println(ram.getDetails());
    }
}
