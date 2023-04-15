package org.nejrasm.zadaca3oop.task2;

public class Vehicle {
    protected double speed;
    protected final String model;

    public Vehicle(final String model) {
        this.model = model;
        this.speed = 0;
    }

    public double accelerate(final double acceleration) {
        return this.speed += acceleration;
    }

    public double decelerate(final double deceleration) {
        if (deceleration >= this.speed) this.speed = 0;
        else this.speed -= deceleration;
        return this.speed;
    }

    @Override
    public String toString() {
        return "vehicle: {" + this.model + "} , speed: {" + this.speed + "} ";
    }

}
