package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Dog dog = context.getBean("dogBean", Dog.class);
        Cat cat = context.getBean("catBean", Cat.class);
        Bear bear = context.getBean("bearBean", Bear.class);

        Person person = context.getBean("personBean", Person.class);
        person.callPet();

    }
}
