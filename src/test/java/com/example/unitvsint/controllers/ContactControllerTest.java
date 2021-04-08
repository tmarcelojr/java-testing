package com.example.unitvsint.controllers;

public class ContactControllerTest {

    public static void main(String[] args) {
        testCheckNumberLength_True();
        testCheckNumberLength_EmptyString();
    }

    // Expecting name, email, phone, and address
    // Need boolean method

    // Instantiate ContactController
    // Instances are not static
    // ContactController contactController = new ContactController();


    // public void testName() {
    //     // if statements
    //     if ("Kevin".equalsIgnoreCase(contactController.name)) {
    //         System.out.println("Test Pass");
    //     } else {
    //         System.out.println("Test Fail");
    //     }
    // }

    // Will get an error that variable cannot be ref

    // Calls checkNumberLength and checks result is true when number test is a regular ten digit String
    public static void testCheckNumberLength_True() {
        // test for the length or integer
        String number_test = "1234567890";
        boolean result = ContactController.checkNumberLength(number_test);
        if (result) {
            System.out.println("Number Length Pass");
        } else {
            System.out.println("Not enough or too much numbers");
        }
    }


    // Write comment here for this method
    public static void testCheckNumberLength_EmptyString() {
        String number_test = "";
        boolean result = ContactController.checkNumberLength(number_test);
        if (!result) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
    }
}
