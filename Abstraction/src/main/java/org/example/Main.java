package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        //an abstract class is a class which is incomplete
        //we cant create instance of an abstract class

        //Animal a1 = new Animal ("dog", "big", 100.23);

        Dog d1 = new Dog("wolf", "big", 100.23);
        //d1.makeNoise();
        doAnimalStuff(d1);

        ArrayList<Animal> a1 = new ArrayList<>();
        a1.add(d1);
        a1.add(new Dog("German Shepard", "big", 150));
        a1.add(new Fish("Goldfish", "small", 10));
        a1.add(new Dog("Pug", "small", 50));
        a1.add(new Fish("Barracuda", "big", 30));

        for(Animal animal : a1){
            doAnimalStuff(animal);
        }

    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("200");




    }
}