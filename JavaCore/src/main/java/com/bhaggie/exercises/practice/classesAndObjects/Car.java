package main.java.com.bhaggie.exercises.practice.classesAndObjects;

import java.util.Objects;

public class Car {
    private String carName;
    private String carType;
    private String modelYear;
    private String carColor;

    public Car(String carName, String carType, String modelYear, String carColor) {
        this.carName = carName;
        this.carType = carType;
        this.modelYear = modelYear;
        this.carColor = carColor;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carType='" + carType + '\'' +
                ", modelYear='" + modelYear + '\'' +
                ", carColor='" + carColor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(carName, car.carName) && Objects.equals(carType, car.carType) && Objects.equals(modelYear, car.modelYear) && Objects.equals(carColor, car.carColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName, carType, modelYear, carColor);
    }
}
