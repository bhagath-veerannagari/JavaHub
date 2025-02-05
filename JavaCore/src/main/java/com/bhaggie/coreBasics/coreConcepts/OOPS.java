package main.java.com.bhaggie.coreBasics.coreConcepts;

import main.java.com.bhaggie.coreBasics.coreUtils.model.*;

import java.math.BigDecimal;

import static java.math.BigDecimal.TEN;

public class OOPS {

    public static void learnInheritance() {
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

    public static void learnEncapsulation() {
        BankAccount account = new BankAccount("Bhagath", TEN, false);

        System.out.println(account.withDraw(new BigDecimal(4.0)));

        System.out.println(account.getBalance());
    }

    public static void learnClassesAndObjects() {
        Address address1 = new Address("3803 SW RichSmith Road", "Unit-204", "Bentonville", "Arkansas", "72713");
        Car car = new Car("Honda Accord", "Sedan", "2023", "Radiant Red Metallic");
        EmploymentDetails empDetails = new EmploymentDetails(true, "Lowes INC", "100k");
        Person person1 = new Person("Bhagath", "Veerannagari", Gender.MALE, address1, car, empDetails);

        System.out.println(person1);
    }

    public static void understandingClassesAndObjects() {
        Cat rose = new Cat("Rose", 6, "Black");
        Cat star = new Cat("Star", 5, "White");
        System.out.println(rose); // toString in pojo enables printing of object attributes
        System.out.println(star);

        // Understanding difference between "==" and ".equals()" for comparing an object
        Cat cat1 = new Cat("Rose", 6, "Black");
        Cat cat2 = new Cat("Rose", 6, "Black");

        System.out.println(cat1 == cat2);  // returns false as it compares the reference values of both the objects
        System.out.println(cat1.equals(cat2)); // returns false if it refers equals method from object class, else returns true if we have an override for equals method in Cat class

        Cat[] cats = {cat1, cat2};
        Person alex = new Person("Alex", "Cortana", Gender.MALE, cats);
        System.out.println(alex);

        //        Cat rose = new Cat();
        //        rose.setName("Rose");
        //        rose.meow();
        //        System.out.println(rose.getName());
        //
        //        Cat star = new Cat();
        //        star.setName("Star");
        //        star.meow();
        //        System.out.println(star.getName());


        //    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.meow();
//    }
//    static class Cat {
//        String name;
//        void meow() {
//            System.out.println(name + ": meow...");
//        }
//    }
//}


//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.name = "Rose";
//        cat.meow();
//    }
//    static class Cat {
//        String name;
//        void meow() {
//            System.out.println(name + ": meow...");
//        }
//    }
//}


//    public static void main(String[] args) {
//        Cat cat = new Cat();
//        cat.meow();
//    }
//    static class Cat {
//        String name = "Rose";
//        void meow() {
//            System.out.println(name + ": meow...");
//        }
//    }
//}
    }
}
