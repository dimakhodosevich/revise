package org.example;

public class Person {

    private Pet pet;

    public Person() {
    }

    public Person(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callPet(){
        System.out.println("Hey hey, come here!!!");
        pet.say();
    }
}
