package org.nejrasm.zadaca3oop.task2;

public class Engine {
    private double capacity;

    public Engine(final double capacity) {

        this.capacity = capacity;
    }

    protected double getCapacity() {
        return this.capacity;
    }

    protected void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double increaseCapacity(final double increase) {
        return this.capacity + increase;
    }

    public double decreaseCapacity(final double decrease) {
        if (this.capacity - decrease > 0) {
            return this.capacity - decrease;
        } else return this.capacity;
    }

    @Override
    public String toString() {
        return "capacity: {" + this.capacity + "} ";
    }
}
