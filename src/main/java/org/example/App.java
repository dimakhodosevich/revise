package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);


        Person p = context.getBean("person", Person.class);
        p.callPet();

        Dog dog = context.getBean(Dog.class);
        Cat cat = context.getBean(Cat.class);
        Bear bear = context.getBean(Bear.class);
        dog.say();
        cat.say();
        bear.say();



    }
}
