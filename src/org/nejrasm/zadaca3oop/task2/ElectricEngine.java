package org.nejrasm.zadaca3oop.task2;

public class ElectricEngine extends Engine {
    public ElectricEngine(final double capacity) {
        super(capacity);
    }

    public double brake(final double brakeSpeed) {
        return this.capacity += brakeSpeed * 0.1;
    }
}
