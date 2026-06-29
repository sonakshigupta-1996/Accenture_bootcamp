package com.bootcampexcercise.module6;

public class AnimalActivity {

    public static void main(String arg[]) {

        // Using interface reference
        Animal cat = new Cat();
        Animal dog = new Dog();

        // Create Mammal object
        Mammal mammal = new Mammal("Tommy");

        // Set animal as Cat
        mammal.setAnimal(cat);
        mammal.animalIsSleeping();
        mammal.animalIsSpeaking();

        System.out.println("------------------");

        // Set animal as Dog
        mammal.setAnimal(dog);
        mammal.animalIsSleeping();
        mammal.animalIsSpeaking();
    }
}
/* Output is:
Animal with name: Tommy is ...
Cat is sleeping!
Animal with name: Tommy is ...
Cat says: 'Meow Meow'!
------------------
Animal with name: Tommy is ...
Dog is sleeping!
Animal with name: Tommy is ...
Dog says: 'Bark Bark'!
*/