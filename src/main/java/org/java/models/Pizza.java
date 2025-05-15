package org.java.models;

import org.java.enums.Base;
import org.java.enums.Ingredient;


import java.util.ArrayList;
import java.util.List;

public class Pizza {

    //Variable declaration
    private org.java.enums.Pizza name;
    private List<Ingredient> ingredients = new ArrayList<>();
    private Base base;
    private int totalCost;

    //Constructor
    public Pizza(org.java.enums.Pizza name, List<Ingredient> ingredients, Base base) {
        this.name = name;
        this.ingredients = ingredients;
        this.base = base;
    }







//    Pizza(int cost){
//            this.cost = cost;
//    }

    public org.java.enums.Pizza getName() {
        return name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public Base getBase() {
        return base;
    }





    public int getCost() {
        return totalCost = ingredients.stream().mapToInt(Ingredient::getCost).sum() + base.getCost() + name.getCost();

    }

    //Return function
    @Override
    public String toString() {
        return "Pizza";
    }


}
