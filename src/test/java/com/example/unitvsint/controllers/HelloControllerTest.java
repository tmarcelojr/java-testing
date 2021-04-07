package com.example.unitvsint.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class HelloControllerTest {
    public HelloController controller;

    // Before each is a void setup that runs before each test as a configuration
    // Useful for avoiding instantiating classes for each test
    @BeforeEach
    void setUp() {
        controller = new HelloController();
    }

    @Test
    void hello() {
        // Purpose is to validate that each unit of the software is doing what it's supposed to do.
        // Create an instance of the class HelloController. Since we have it in our BeforeEach we will no longer need to put it in here.
        String response = controller.hello("Teo"); // Act
        // Created an instance, passing in the argument for name
        assertThat(response).isEqualTo("Hello, Teo!"); // Assert
        // You can write assertThat in this format for better readability or you can write it this way:
        // assertEquals("Hello, World", response);
    }
}