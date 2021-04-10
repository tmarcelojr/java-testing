package com.example.unitvsint.controllers;

public class ContactController {
    static String name = "kEvIn";

    public static boolean checkNumberLength(String number) {
        if (number.length() == 10) {
            return true;
        } else {
            return false;
        }
    }
}
