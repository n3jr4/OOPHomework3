package org.nejrasm.zadaca3oop.task2;

public class ElectricCar extends Vehicle {
    private final ElectricEngine electricCarEngine;

    public ElectricCar(final String model, final double capacity) {
        super(model);
        this.electricCarEngine = new ElectricEngine(capacity);
    }

    @Override
    public double accelerate(final double acceleration) {
        final double capacityState = this.electricCarEngine.decreaseCapacity(0.4 * acceleration / 100);
        if ((this.electricCarEngine.capacity - capacityState) > 0) {
            this.electricCarEngine.capacity = capacityState;
            super.accelerate(acceleration);
        }
        return this.speed;
    }

    @Override
    public double decelerate(final double deceleration) {
        super.decelerate(deceleration);
        this.electricCarEngine.brake(deceleration / 100); //I have added here /100 to make more sens in calculations. Sample with increase is commented below.
        //this.electricCarEngine.capacity = this.electricCarEngine.increaseCapacity(0.1*deceleration/100);
        return this.speed;
    }

    @Override
    public String toString() {
        return super.toString() + this.electricCarEngine.toString();
    }
}
