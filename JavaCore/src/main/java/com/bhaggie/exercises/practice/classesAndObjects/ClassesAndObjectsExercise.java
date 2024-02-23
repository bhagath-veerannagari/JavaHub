package main.java.com.bhaggie.exercises.practice.classesAndObjects;

public class ClassesAndObjectsExercise {
    public static void main(String[] args) {

        Address address = new Address("3803 SW RichSmith Road", "Unit-204", "Bentonville", "Arkansas", "72713");
        Car car = new Car("Honda Accord", "Sedan", "2023", "Radiant Red Metallic");
        EmploymentDetails empDetails = new EmploymentDetails(true, "Lowes INC", "100k");
        Person person1 = new Person("Bhagath", "Veerannagari", Gender.MALE, address, car, empDetails);

        System.out.println(person1);
    }
}
