package com.example.unitvsint.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloControllerTest {

    @Test
    void hello() {
    //    Purpose is to validate that each unit of the software is doing what it's supposed to do.
    //    Create an instance of the class HelloController
        HelloController controller = new HelloController(); // Arrange
        String response = controller.hello("World"); // Act
        // Created an instance, passing in the argument for name
        assertEquals("Hello, World!", response); // Assert
    }
}