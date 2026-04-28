package org.example.zoo;

public abstract class Animal {
    String name;
    String species;
    int age;


    Animal(String name, String species, int age){
           this.name = name;
           this.species = species;
           this.age = age;

    }

    public abstract void feed();

}
