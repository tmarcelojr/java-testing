package com.example.unitvsint.controllers;

public class HelloController {

    public String hello(String firstName, String lastName) {
        // In Java, %s takes in any value which is then assigned by the following parameter.

        return String.format("Hello, %s %s!", firstName, lastName);
    }
}
