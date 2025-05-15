package org.java;


import org.java.enums.*;
import org.java.models.Menu;
import org.java.models.Pizza;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        List<Ingredient> toppings = new ArrayList<>();
        toppings.add(Ingredient.Chicken);
        toppings.add(Ingredient.Cheese);
        Type type;
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(Ingredient.Panner);
        Pizza pizza = new Pizza(org.java.enums.Pizza.CheeseBurst, ingredients, Base.GLUTENFREE);

        Beverages drink;
        Menu menu = new Menu(toppings, Type.Large, pizza, Beverages.Coke );

        System.out.println(menu);
        System.out.println(menu.getPrice());


    }
}


