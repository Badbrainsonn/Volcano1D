package org.example.oop;

public class Truck extends Vehicle {

    int maxLoadCapacity;
    String truckCategory;

    @Override
    public void bookTestDrive() {
        System.out.println("Booked for C category");
    }
}
