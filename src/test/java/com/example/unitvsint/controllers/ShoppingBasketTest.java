package com.example.unitvsint.controllers;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingBasketTest {

    public static void main(String[] args) {
        totalOfEmptyBasket();
        totalOfOneItem();
        totalOfTwoItems();
    }

    // calls getTotal and returns 0
    public static void totalOfEmptyBasket() {
        // setup
        int mockTotal = 0;
        ShoppingBasket basket = new ShoppingBasket(new ArrayList<>());

        // action
        int result = basket.getTotal();

        // outcome
        if(result == mockTotal) {
            System.out.println(String.format("Empty: Test pass. Expected: %s Actual: %s", mockTotal, result));
        } else {
            System.out.println(String.format("Empty: Test fail. Expected: %s Actual: %s", mockTotal, result));
        }
    }

    // calls getTotal and returns total of one item
    public static void totalOfOneItem() {
        // setup
        int expectedTotal = 45;
        ShoppingBasket basket = new ShoppingBasket(Arrays.asList(new Item(45, 1)));

        // action
        int result = basket.getTotal();

        // outcome
        if(result == expectedTotal) {
            System.out.println(String.format("Empty: Test pass. Expected: %s Actual: %s", expectedTotal, result));
        } else {
            System.out.println(String.format("Empty: Test fail. Expected: %s Actual: %s", expectedTotal, result));
        }
    }

    public static void totalOfTwoItems() {
        // setup
        int mockTotal = 125;
        ShoppingBasket basket = new ShoppingBasket(Arrays.asList(new Item(25, 1), new Item(100, 1)));

        // action
        int result = basket.getTotal();

        // outcome
        if(result == mockTotal) {
            System.out.println(String.format("Empty: Test pass. Expected: %s Actual: %s", mockTotal, result));
        } else {
            System.out.println(String.format("Empty: Test fail. Expected: %s Actual: %s", mockTotal, result));
        }
    }


}
