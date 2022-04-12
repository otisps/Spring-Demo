package com.otisps.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    
    @GetMapping("/hello")
    public String HelloPerson(@RequestBody Person person){
        String message = "Hello " + person.givenName + " " + person.getLastName() + " !";
        return message;
    }
}
