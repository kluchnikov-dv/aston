package com.aston.homework.lecture2.task1;


/**
 * 2.1 Создайте интерфейс Vehicle с методами start(), stop() и getFuelType(). Создайте абстрактный класс Car,
 *     который реализует интерфейс Vehicle и добавляет следующие абстрактные методы: getNumberOfDoors() и
 *     getTrunkCapacity(). Создайте два конкретных класса Sedan и Truck, которые наследуются от класса Car.
 *     Реализуйте все необходимые методы в этих класах. В классе Sedan добавьте дополнительный метод
 *     getLuxuryLevel(), который возвращает строку, описывающую уровень роскоши автомобиля. В классе Truck
 *     добавьте дополнительный метод getMaxLoadCapacity(), который возвращает максимальную грузоподъёмность
 *     грузовика. Проверьте работу всех методов для созданных объектов.
 */
public class Demo {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        Truck truck = new Truck();

        sedan.start();
        sedan.stop();
        System.out.println("Тип используемого топлива: " + sedan.getFuelType());
        System.out.println("Колличесвто дверей: " + sedan.getNumberOfDoors());
        System.out.println("Вместимость багажника: " + sedan.getTrunkCapacity() + "л.");
        System.out.println("Уровень класса седана: " + sedan.getLuxuryLevel(3));
        System.out.println();

        truck.start();
        truck.stop();
        System.out.println("Тип используемого топлива: " + truck.getFuelType());
        System.out.println("Колличесвто дверей: " + truck.getNumberOfDoors());
        System.out.println("Вместимость багажника: " + truck.getTrunkCapacity() + "л.");
        System.out.println("Максимальная грузоподъёмность грузовика: " + truck.getMaxLoadCapacity() + "кг.");

        
    }
}
