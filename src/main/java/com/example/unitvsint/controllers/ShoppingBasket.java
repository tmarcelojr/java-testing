package com.example.unitvsint.controllers;

import java.util.List;

public class ShoppingBasket {

    private final List<Item> items;

    public ShoppingBasket(List<Item> items) {
        this.items = items;
    }

    public int getTotal() {
        if(items.isEmpty()) {
            return 0;
        }
        return items.get(0).getUnitPrice();
    }
}
