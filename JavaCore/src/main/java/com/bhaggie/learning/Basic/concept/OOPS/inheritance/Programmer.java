package main.java.com.bhaggie.learning.Basic.concept.OOPS.inheritance;

import java.util.Arrays;

public class Programmer extends Employee{
    private String[] programmingLanguages;

    public Programmer(String name, Address address, int age, int experience, String[] programmingLanguages) {
        super(name, address, age, experience);
        this.programmingLanguages = programmingLanguages;
    }

    public String[] getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "programmingLanguages=" + Arrays.toString(programmingLanguages) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Programmer that = (Programmer) o;
        return Arrays.equals(programmingLanguages, that.programmingLanguages);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + Arrays.hashCode(programmingLanguages);
        return result;
    }

    public void writeCode() {
        System.out.println("Write the code for software");
    }
}
