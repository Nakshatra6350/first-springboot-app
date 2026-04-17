package com.learning.firstSpringApp;


import org.springframework.stereotype.Component;

@Component // creates bean
public class Dog {
    public String fun(){
        return "Something";
    }
}
