package com.example.unitvsint.controllers;

public class HelloController {

    public String hello(String name) {
        return String.format("Hello, %s!", name);
    }
}
