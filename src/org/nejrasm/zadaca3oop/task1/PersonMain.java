package org.nejrasm.zadaca3oop.task1;

public class PersonMain {
    public static void main(String[] args) {
        final Person person = new Person("Nejra");
        System.out.println(person.toString());

        final Employee employee = new Employee(15000, "1258632ert58", "Jovica");
        System.out.println(employee.toString());
    }
}
