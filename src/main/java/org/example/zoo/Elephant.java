package org.example.zoo;

public class Elephant extends Animal implements SpecialTrick {
    Elephant(String name, String species, int age) {
        super(name, species, age);

    }

    @Override
    public void feed() {
        System.out.println(name + "\t " + "Ест траву ");

    }


    @Override
    public void trick() {
        System.out.println("Слона  можно дрессировать");
    }
}