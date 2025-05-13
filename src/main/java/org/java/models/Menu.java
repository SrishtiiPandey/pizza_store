package org.java.models;

import org.java.enums.Ingredient;
import org.java.enums.Type;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private int price;
    private List<Ingredient> topping = new ArrayList<>();
    private Type type;
    private Pizza pizza;

    public Menu(int price, List<Ingredient> topping, Type type, Pizza pizza) {
        this.price = price;
        this.topping = topping;
        this.type = type;
        this.pizza = pizza;
    }

    @Override
    public String toString(){
        return "Menu";
    }
}
