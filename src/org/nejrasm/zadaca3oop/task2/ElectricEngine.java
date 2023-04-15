package org.nejrasm.zadaca3oop.task2;

public class ElectricEngine extends Engine {
    public ElectricEngine(final double capacity) {
        super(capacity);
    }

    public void brake(final double brakeSpeed) {
        this.setCapacity(super.increaseCapacity(brakeSpeed * 0.1));
    }
}
