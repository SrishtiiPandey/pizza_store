package org.java.models;

import org.java.enums.*;

import java.util.ArrayList;
import java.util.List;

public abstract class Menu {

    private List<Meal> meal = new ArrayList<>();

    public Menu() {
        // Creating meals and adding them to the list
        List<Ingredient> cheeseBurstIngredient = addIngredient(new Ingredient[]{Ingredient.Cheese, Ingredient.Jalepeo});
        Pizza pizzaCheeseBurst = new Pizza(org.java.enums.Pizza.CheeseBurst, cheeseBurstIngredient, Base.WHEAT);

        List<Ingredient> farmHouseIngredient = addIngredient(new Ingredient[]{Ingredient.Chicken, Ingredient.Cheese});
        Pizza pizzaFarmHouse = new Pizza(org.java.enums.Pizza.Farmhouse, farmHouseIngredient, Base.MAIDA);

        List<Ingredient> margetaIngredient = addIngredient(new Ingredient[]{Ingredient.Panner, Ingredient.Cheese});
        Pizza pizzaMargreta = new Pizza(org.java.enums.Pizza.Margreta, margetaIngredient, Base.GLUTENFREE);

        Meal cheeseBurstMeal = new Meal(pizzaCheeseBurst, Beverages.Coke);
        Meal farmHouseMeal = new Meal(pizzaFarmHouse, Beverages.Mojito);
        Meal margretaMeal= new Meal(pizzaMargreta, Beverages.Mojito);



        // Add meals to the list
        meal.add(cheeseBurstMeal);
        meal.add(farmHouseMeal);
        meal.add(margretaMeal);
    }

    //  method to convert arrayList to list
    public List<Ingredient> addIngredient(Ingredient[] ingredients) {
        return new ArrayList<>(List.of(ingredients));
    }

    // Return the list of meals
    public List<Meal> getMeals() {
        return meal;
    }



}
