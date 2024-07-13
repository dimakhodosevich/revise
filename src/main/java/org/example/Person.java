package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

public class Person {


    private Pet pet;
    private int age;
    private String owner;

    @Autowired

    public Person(@Qualifier("dog") Pet pet) {
        this.pet = pet;
    }

    public Person() {
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

    @PostConstruct
    public void initMethod(){
        System.out.println("Подключение ресурсов");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("Отключение ресурсов");
    }

    public void callPet(){
        System.out.println("Hey hey, come here!!!");
        pet.say();
    }
}
