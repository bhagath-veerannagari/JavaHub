package main.java.com.bhaggie.coreBasics.coreUtils.model;

import java.util.Objects;

public class EmploymentDetails {
    private Boolean isEmployed;
    private String employerName;
    private String salary;

    public EmploymentDetails(Boolean isEmployed, String employerName, String salary) {
        this.isEmployed = isEmployed;
        this.employerName = employerName;
        this.salary = salary;
    }

    public EmploymentDetails(Boolean isEmployed) {
        this.isEmployed = isEmployed;
        this.employerName = "Un-Employed";
        this.salary = "No Salary";
    }

    public Boolean getEmployed() {
        return isEmployed;
    }

    public void setEmployed(Boolean employed) {
        isEmployed = employed;
    }

    public String getEmployerName() {
        return employerName;
    }

    public void setEmployerName(String employerName) {
        this.employerName = employerName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmploymentDetails{" +
                "isEmployed=" + isEmployed +
                ", employerName='" + employerName + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmploymentDetails that = (EmploymentDetails) o;
        return Objects.equals(isEmployed, that.isEmployed) && Objects.equals(employerName, that.employerName) && Objects.equals(salary, that.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isEmployed, employerName, salary);
    }
}
