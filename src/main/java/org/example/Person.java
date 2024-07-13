package org.example;

public class Person {

    private Pet pet;
    private int age;
    private String owner;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void initMethod(){
        System.out.println("Подключение ресурсов");
    }

    public void destroyMethod(){
        System.out.println("Отключение ресурсов");
    }

    public void callPet(){
        System.out.println("Hey hey, come here!!!");
        pet.say();
    }
}
