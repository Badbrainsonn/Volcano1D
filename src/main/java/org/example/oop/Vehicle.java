package org.example.oop;

public abstract class Vehicle {

    String model;
    String color;
    double price;

    public boolean isAvailable() {
        return true;
    }

    public abstract void bookTestDrive();

}
