package org.example;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{



    @Override
    public void say(){
        System.out.println("Meow Meow");
    }
}
