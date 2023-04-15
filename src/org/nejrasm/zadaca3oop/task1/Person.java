package org.nejrasm.zadaca3oop.task1;

public class Person {
    protected final String name;

    public Person(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: {" + this.name + "}";
    }
}
