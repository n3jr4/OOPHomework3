package org.nejrasm.zadaca3oop.task2;

public class ElectricCar extends Vehicle {
    private final ElectricEngine electricCarEngine;

    public ElectricCar(final String model, final double capacity) {
        super(model);
        this.electricCarEngine = new ElectricEngine(capacity);
    }

    @Override
    public double accelerate(final double acceleration) {
        final double capacityState = this.electricCarEngine.decreaseCapacity(0.4 * acceleration);
        if ((this.electricCarEngine.getCapacity() - capacityState) > 0) {
            this.electricCarEngine.setCapacity(capacityState);
            super.accelerate(acceleration);
        }
        return acceleration;
    }

    @Override
    public double decelerate(final double deceleration) {
        double amountToIncreaseCharge = super.decelerate(deceleration);
        this.electricCarEngine.brake(amountToIncreaseCharge);
        return amountToIncreaseCharge;
    }

    @Override
    public String toString() {
        return super.toString() + this.electricCarEngine.toString();
    }
}
