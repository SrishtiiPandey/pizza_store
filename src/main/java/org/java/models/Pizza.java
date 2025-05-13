package org.java.models;

import org.java.enums.Base;
import org.java.enums.Ingredient;


import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private Pizza name;
    private List<Ingredient> ingredients = new ArrayList<>();
    private Base base;

    public Pizza(Pizza name, List<Ingredient> ingredients, Base base) {
        this.name = name;
        this.ingredients = ingredients;
        this.base = base;
    }

    @Override
    public String toString() {
        return "Pizza";
    }


}
