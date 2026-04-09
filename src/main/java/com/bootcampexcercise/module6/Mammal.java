package com.bootcampexcercise.module6;

public class Mammal {

    private Animal myAnimal;
    private String name;

    // Constructor
    public Mammal(String name) {
        this.name = name;
    }

    // Set Animal (Cat or Dog)
    public void setAnimal(Animal animal) {
        myAnimal = animal;
    }

    // Call sleep method
    public void animalIsSleeping() {
        System.out.println("Animal with name: " + name + " is ...");
        myAnimal.sleep(); // calling interface method
    }

    // Call animalSound method
    public void animalIsSpeaking() {
        System.out.println("Animal with name: " + name + " is ...");
        myAnimal.animalSound(); // calling interface method
    }
}
