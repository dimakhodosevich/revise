package org.example;

import org.springframework.stereotype.Component;

@Component
public class Bear implements Pet{

    @Override
    public void say(){
        System.out.println("Rrr Rrr");
    }
}
