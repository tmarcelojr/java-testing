package com.example.unitvsint.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// We pass it RestController because we want this class to be a controller for rest
@RestController
public class HelloController {

    // We will need to pass in GetMapping for our Get route
    @GetMapping("/hello")
    public String hello(@RequestParam(name= "name", defaultValue = "World") String name) {
        // We will be using RequestParam for our url params

        // In Java, %s takes in any value which is then assigned by the following parameter.
        return String.format("Hello, %s!", name);
    }
}
