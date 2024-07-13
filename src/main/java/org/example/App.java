package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import javax.xml.validation.Validator;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("xmlConfig.xml");

        Person p = context.getBean("person", Person.class);
        p.callPet();

        Dog dog = (Dog)p.getPet();
        System.out.println(dog.age);
        System.out.println(dog.name);
            context.close();

    }
}
