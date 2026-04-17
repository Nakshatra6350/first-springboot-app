package com.learning.firstSpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //also creates bean
public class Car {

    @Autowired // dependency injection
    private Dog dog;

    @GetMapping("/ok")
    public String ok(){
        return dog.fun();
    }
}
