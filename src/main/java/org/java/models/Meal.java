package org.java.models;

import org.java.enums.Beverages;
import org.java.enums.Ingredient;
import org.java.enums.Type;

import java.util.ArrayList;
import java.util.List;

public class Meal {

    //Variable declaring and datatypes as enum
    private Pizza pizza;
    private Beverages drinks;

    public Meal() {}

    public Meal(Pizza pizza, Beverages drinks) {
        this.pizza = pizza;
        this.drinks = drinks;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Beverages getDrinks() {
        return drinks;
    }

    public void setDrinks(Beverages drinks) {
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        return "Pizza: " + pizza.getName().name() +
                "\nBase: " + pizza.getBase().name() +
                "\nToppings: " + pizza.getIngredients().stream().map(Enum::name).toList() +
                "\nDrink: " + drinks.name() +
                "\nMeal Price: $" + (pizza.getCost() + drinks.getCost()) +
                "\n--------------------------";
    }

}
