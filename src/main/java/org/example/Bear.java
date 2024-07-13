package org.example;

import org.springframework.stereotype.Component;


public class Bear implements Pet{

    @Override
    public void say(){
        System.out.println("Rrr Rrr");
    }
}
