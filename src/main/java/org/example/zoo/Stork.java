package org.example.zoo;


public class Stork extends Bird implements Flying {
    Stork(String name, String species, int age, String color) {
        super(name, species, age);
    }

    @Override
    public void fly() {
        System.out.println(name + "\t" + "Мигрирует в теплые странны");
    }

    @Override
    public void feed() {
        System.out.println( name + "\t" + "eats frog");
    }
}
