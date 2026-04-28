package org.example.zoo;

public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo();
        zoo.feedAllAnimals();
        zoo.printAnimalCount();


        Lion lion = new Lion("Mufasa", "Lion", 36);
        System.out.println(lion.name + "\t" + lion.age + "\t" + lion.species);
        zoo.addAnimal(lion);
        lion.feed();


        System.out.println(" ");


        Elephant elephant = new Elephant("Dambo", "Elephant", 102);
        System.out.println(elephant.name + "\t" + elephant.species + "\t" + elephant.age);
        zoo.addAnimal(elephant);
        elephant.feed();
        elephant.trick();

        System.out.println(" ");

        Stork stork = new Stork("Dady", "Stork", 12, "Black and white");
        System.out.println(stork.name + "\t" + stork.species + "\t" + stork.age);
        zoo.addAnimal(stork);
        stork.fly();
        stork.feed();


        zoo.printAnimalCount();


        Penguin penguin = new Penguin("Addy", "Penguin", 5);

    }

}
