package org.example.zoo;

public class Lion extends Animal {

    Lion(String name, String species, int age) {
        super(name, species, age);
    }

    @Override
    public void feed() {
        System.out.println( name + " "  +  "ест шницель");
    }


}
