package org.nejrasm.zadaca3oop.task2;

public class CarsMain {
    public static void main(String[] args) {
        final Car car = new Car("Peugeot", 40);
        System.out.println(car.toString());
        car.accelerate(100);
        System.out.println(car.toString());
        car.decelerate(150);
        System.out.println(car.toString());

        final ElectricCar electricCar = new ElectricCar("Renault", 200);
        electricCar.accelerate(50);
        electricCar.decelerate(60);
        System.out.println(electricCar.toString());

        final Vehicle vehicle = new Vehicle("Imaginary");
        vehicle.accelerate(100);
        vehicle.decelerate(150);
        System.out.println(vehicle.toString());
    }
}
