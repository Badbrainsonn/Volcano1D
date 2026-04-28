package org.example.zoo;

public class Penguin  extends  Bird implements Flying, SpecialTrick {
    Penguin(String name, String species, int age) {
        super(name, species, age);
    }



    @Override
    public void feed() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void trick() {

    }
}
