package main.java.com.bhaggie.coreBasics.coreUtils.model;

import java.util.Objects;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, Address address, int age, int experience, int teamSize) {
        super(name, address, age, experience);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "teamSize=" + teamSize +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return teamSize == manager.teamSize;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), teamSize);
    }

    public void report() {
        System.out.println("Works on the team reports");
    }


}
