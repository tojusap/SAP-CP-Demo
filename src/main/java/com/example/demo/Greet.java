package com.example.demo;

public class Greet {
    public int id;
    public String content;
    public Greet(String name){
        content = "Hello, " + name + "!";
        id = GreetingController.times++;
    }
}
