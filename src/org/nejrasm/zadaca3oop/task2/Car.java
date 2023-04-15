package org.nejrasm.zadaca3oop.task2;

public class Car extends Vehicle {
    private final DieselEngine carEngine;

    public Car(final String model, final double capacity) {
        super(model);
        this.carEngine = new DieselEngine(capacity);
    }

    @Override
    public double accelerate(final double acceleration) {
        final double capacityState = this.carEngine.decreaseCapacity(0.2 * acceleration / 100);
        if ((this.carEngine.capacity - capacityState) > 0) {
            this.carEngine.capacity = capacityState;
            super.accelerate(acceleration);
        }
        return this.speed;
    }

    @Override
    public String toString() {
        return super.toString() + this.carEngine.toString();
    }
}
