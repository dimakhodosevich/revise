package org.example;

public class PetFactory {

//    public PetFactory() {
//    }

    public Cat createCat(){
        return new Cat();
    }

    public Dog createDog(){
        return new Dog();
    }

    public Bear createBear(){
        return new Bear();
    }
}
