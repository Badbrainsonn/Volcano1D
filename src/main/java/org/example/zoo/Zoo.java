package org.example.zoo;

import java.util.ArrayList;

public class Zoo {

    private final ArrayList<Animal> animals = new ArrayList<>();


    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void feedAllAnimals() {
        for (Animal animal : animals) {
            animal.feed();
        }
    }

    public void printAnimalCount() {
        System.out.println("Кол-во зверей в zoo" + animals.size());
    }

    public void allFlyingBirdsFly() {
        for (Animal animal : animals) {
            if (animal instanceof Flying){
                Flying bird = (Flying) animal;
                bird.fly();
            }
        }

    }

    // todo all animals that can be trained should perform special trick


}
