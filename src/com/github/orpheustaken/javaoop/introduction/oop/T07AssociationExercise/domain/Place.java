package com.github.orpheustaken.javaoop.introduction.oop.T07AssociationExercise.domain;

public class Place {
    private String address;

    public Place(String address) {
        this.address = address;
    }

    public void print() {
        System.out.println("Address: " + this.address);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
