package org.java.models;

import org.java.enums.Base;
import org.java.enums.Beverages;
import org.java.enums.Ingredient;
import org.java.enums.Type;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Menu> cart = new ArrayList<>();

    public Cart(List<Menu> cart) {
        this.cart = cart;
    }

    public Cart() {}

    @Override
    public String toString() {
        return "Cart";
    }
}
