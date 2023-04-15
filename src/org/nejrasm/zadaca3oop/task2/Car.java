package org.nejrasm.zadaca3oop.task2;

public class Car extends Vehicle {
    private final DieselEngine carEngine;

    public Car(final String model, final double capacity) {
        super(model);
        this.carEngine = new DieselEngine(capacity);
    }

    @Override
    public double accelerate(final double acceleration) {
        final double capacityState = this.carEngine.decreaseCapacity(0.2 * acceleration);
        if ((this.carEngine.getCapacity() - capacityState) > 0) {
            this.carEngine.setCapacity(capacityState);
            super.accelerate(acceleration);
        }
        return acceleration;
    }

    @Override
    public String toString() {
        return super.toString() + this.carEngine.toString();
    }
}
