package org.nejrasm.zadaca3oop.task2;

public class Vehicle {
    private double speed;
    private final String model;

    public Vehicle(final String model) {
        this.model = model;
        this.speed = 0;
    }

    public double accelerate(final double acceleration) {
        this.speed += acceleration;
        return acceleration;
    }

    public double decelerate(final double deceleration) {
        double finalDecelaration = deceleration;
        if (deceleration > this.speed) {
            finalDecelaration = this.speed;
            this.speed = 0;
        } else this.speed -= deceleration;
        return finalDecelaration;
    }

    @Override
    public String toString() {
        return "vehicle: {" + this.model + "} , speed: {" + this.speed + "} ";
    }

}
