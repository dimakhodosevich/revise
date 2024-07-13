package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {


    @Bean
    public Cat catBean(){
        return new Cat();
    }

    @Bean
    public Dog dogBean(){
        return new Dog();
    }

    @Bean
    public Bear bearBean(){
        return new Bear();
    }

    @Bean
    public Person personBean(){
        return new Person(dogBean());
    }


}
