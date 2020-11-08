package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    static int times = 1;

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greet greetUser(@RequestParam(value = "name", defaultValue = "World") String name){
        Greet greet = new Greet(name);
        return greet;
    }
}
