package org.nejrasm.zadaca3oop.task1;

public class Employee extends Person {
    private final double annualSalary;
    private final String nationalInsuranceNumber;

    public Employee(final double annualSalary, final String nationalInsuranceNumber, final String name) {
        super(name);
        this.annualSalary = annualSalary;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", salary: {" + this.annualSalary + "}, insurance number: {" + this.nationalInsuranceNumber + "}";
    }

}
