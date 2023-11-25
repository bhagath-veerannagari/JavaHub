package main.java.com.bhaggie.exercises.practice.classesAndObjects;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private Address address;
    private Car carDetails;
    private EmploymentDetails empDetails;

    public Person(String firstName, String lastName, Gender gender, Address address, Car carDetails, EmploymentDetails empDetails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.carDetails = carDetails;
        this.empDetails = empDetails;
    }

    public Person(String firstName, String lastName, Gender gender, Address address, EmploymentDetails empDetails) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.address = address;
        this.empDetails = empDetails;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car getCarDetails() {
        return carDetails;
    }

    public void setCarDetails(Car carDetails) {
        this.carDetails = carDetails;
    }

    public EmploymentDetails getEmpDetails() {
        return empDetails;
    }

    public void setEmpDetails(EmploymentDetails empDetails) {
        this.empDetails = empDetails;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", address=" + address +
                ", carDetails=" + carDetails +
                ", empDetails=" + empDetails +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && gender == person.gender && Objects.equals(address, person.address) && Objects.equals(carDetails, person.carDetails) && Objects.equals(empDetails, person.empDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, address, carDetails, empDetails);
    }
}
