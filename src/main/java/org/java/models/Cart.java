package org.java.models;

import org.java.enums.Base;
import org.java.enums.Beverages;
import org.java.enums.Ingredient;
import org.java.enums.Type;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Meal> meals ;

    public Cart() {
        this.meals = new ArrayList<>();
    }

    public void addCart(Meal meal) {
        meals.add(meal);
    }

    public List<Meal> getMeals() {
        return meals;
    }


    @Override
    public String toString() {
        return "Cart" ;
    }
}
