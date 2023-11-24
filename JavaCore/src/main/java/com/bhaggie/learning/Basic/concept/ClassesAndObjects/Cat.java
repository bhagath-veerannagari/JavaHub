package main.java.com.bhaggie.learning.Basic.concept.ClassesAndObjects;

import java.util.Objects;

public class Cat {

    private String name;
    private int age;
    private String color;

    // Default Constructor
    public Cat() {

    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // The inside constructor
    public Cat(String name, int age, String color) {
        this(name, age);
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void meow() {
        System.out.println(name + ": meow...");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

