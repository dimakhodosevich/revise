package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;



public class Person {


    private Pet pet;

    @Value("20")
    private int age;
    @Value("Dima")
    private String owner;



    public Person(Pet pet) {
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
