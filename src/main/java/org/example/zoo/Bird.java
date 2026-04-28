package org.example.zoo;

public class Bird extends Animal {

    String color;

    Bird(String name, String species, int age) {
        super(name, species, age);

        this.color = color;


    }

    @Override
    public void feed() {
        System.out.println(); // Вопрос как сделать так что бы автоматически наследовался метод и
        // И автоматически подбиралось имя животного
    }
}
