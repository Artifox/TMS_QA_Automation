package lesson6.person;

import lesson6.person.Accountant;
import lesson6.person.Employee;
import lesson6.person.Person;

public class Runner {
    public static void main(String[] args) {
        Person p = new Person("Sam",10,"+375445543485");


        Employee employee = new Employee("Sam",10,"+375445543485", "IBM");

        Accountant ac = new Accountant("Ann", 20, "+37549382304", "Tesla", true);

        Person tom = new Employee("Tom", 12,"+37549304594", "APPLE");
        tom.printInfo();
    }

}
