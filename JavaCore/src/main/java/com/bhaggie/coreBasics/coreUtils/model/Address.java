package main.java.com.bhaggie.coreBasics.coreUtils.model;

import java.util.Objects;

public class Address {
    private String addressLane1;
    private String addressLane2;
    private String city;
    private String state;
    private String postalCode;

    public Address() {
    }

    public Address(String addressLane1, String addressLane2, String city, String state, String postalCode) {
        this.addressLane1 = addressLane1;
        this.addressLane2 = addressLane2;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
    }

    public String getAddressLane1() {
        return addressLane1;
    }

    public void setAddressLane1(String addressLane1) {
        this.addressLane1 = addressLane1;
    }

    public String getAddressLane2() {
        return addressLane2;
    }

    public void setAddressLane2(String addressLane2) {
        this.addressLane2 = addressLane2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressLane1='" + addressLane1 + '\'' +
                ", addressLane2='" + addressLane2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(addressLane1, address.addressLane1) && Objects.equals(addressLane2, address.addressLane2) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(postalCode, address.postalCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addressLane1, addressLane2, city, state, postalCode);
    }
}
