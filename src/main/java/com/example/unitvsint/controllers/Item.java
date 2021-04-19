package com.example.unitvsint.controllers;

public class Item {
    private int price;

    public Item(int price, int quantity) {
        this.price = price;
    }

    public int getUnitPrice() {
        return price;
    }
}
