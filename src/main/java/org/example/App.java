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
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        Person person = context.getBean(Person.class);

        person.callPet();
        System.out.println(person.getOwner());
        System.out.println(person.getAge());



    }
}
