package com.learning.firstSpringApp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // creates bean
public class MyClass {

    @GetMapping("abc")
    public String sayHello(){
        return "Hello";
    }

}
