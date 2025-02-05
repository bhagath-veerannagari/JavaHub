package main.java.com.bhaggie.coreBasics.coreConcepts.OOPS;

import main.java.com.bhaggie.coreBasics.coreUtils.model.Employee;
import main.java.com.bhaggie.coreBasics.coreUtils.model.Address;
import main.java.com.bhaggie.coreBasics.coreUtils.model.Manager;
import main.java.com.bhaggie.coreBasics.coreUtils.model.Programmer;

public class InheritanceMain {
    public static void main(String[] args) {

        Address address = new Address("3803 SW RichSmith Road", "Unit-204", "Bentonville", "Arkansas", "72713");

        Employee employee = new Employee("Sunil", address, 25, 2);

        String[] languages = {"Java", "Python", "SQL"};
        Programmer programmer = new Programmer("Bhagath", address, 29, 6, languages);

        Manager manager = new Manager("Prakash", address, 42, 19, 25);

        System.out.println(employee);
        System.out.println(programmer);
        programmer.writeCode();
        System.out.println(manager);
        manager.report();
    }
}
