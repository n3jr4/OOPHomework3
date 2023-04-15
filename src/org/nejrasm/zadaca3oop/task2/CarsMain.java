package org.nejrasm.zadaca3oop.task2;

public class CarsMain {
    public static void main(String[] args) {
        final Car car = new Car("Peugeot", 12);
        System.out.println(car.toString());
        car.accelerate(100);
        car.decelerate(5);
        System.out.println(car.toString());

        final ElectricCar electricCar = new ElectricCar("Renault", 12);
        electricCar.accelerate(50);
        electricCar.decelerate(10);
        System.out.println(electricCar.toString());
    }
}
