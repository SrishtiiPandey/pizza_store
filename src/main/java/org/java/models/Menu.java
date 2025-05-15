package org.java.models;
import org.java.enums.Base;
import org.java.enums.Beverages;
import org.java.enums.Ingredient;
import org.java.enums.Type;
import java.util.ArrayList;
import java.util.List;

public abstract class Menu {

    private int price;
    private List<Ingredient> topping = new ArrayList<>();
    private Type type;
    private List<Menu> menu = new ArrayList<>();
    private List<Meal> meal = new ArrayList<>();

    List<Ingredient> cheeseBurstIngredient = addIngredient(new Ingredient[]{Ingredient.Cheese,Ingredient.Jalepeo});
    Pizza pizzaCheeseBurst = new Pizza(org.java.enums.Pizza.CheeseBurst, cheeseBurstIngredient, Base.WHEAT);

    List<Ingredient> farmHouseIngredient = addIngredient(new Ingredient[]{Ingredient.Chicken, Ingredient.Cheese});
    Pizza pizzaFarmHouse = new Pizza(org.java.enums.Pizza.Farmhouse, farmHouseIngredient, Base.MAIDA);

    Meal cheeseBurstMeal = new Meal(pizzaCheeseBurst , Beverages.Coke);
    Meal farmHouseMeal = new Meal(pizzaFarmHouse, Beverages.Mojito);

    public List<Ingredient> addIngredient(Ingredient[] ingredients) {
        List<Ingredient> ingred = new ArrayList<>();
        for (Ingredient name : ingredients) {
            ingred.add(name);
        }
        return ingred;
    }

    public void addMeal(Meal meals){
        meal.add(meals);
    }



    //Constructor
    public Menu(List<Ingredient> topping, Type type, Pizza pizza, Beverages drinks) {
        this.price = type.getCost() + topping.stream().mapToInt(Ingredient::getCost).sum() + drinks.getCost() + pizza.getCost();
        this.topping = topping;
        this.type = type;
//        this.pizza = pizza;
//        this.drinks = drinks;
    }

    //Constructor
    //For safer side empty constructor is been made
    public Menu(){ }

    //Constructor
    //For multiple menus this constructor is initialised
    public Menu(List<Menu> menu){
        this.menu = menu;
    }

    public int getPrice() {
        return price;
    }

    //Method to return
    @Override
    public String toString() {
        return "--------- Bill ---------" +
//                "\nPizza         : " + pizza.getName().name() +
//                "\nBase          : " + pizza.getBase().name() +
//                "\nPizza Toppings: " + pizza.getIngredients().stream().map(Enum::name).toList() +
                "\nSize (Type)   : " + type.name() +
                "\nExtra Toppings: " + topping.stream().map(Enum::name).toList() +
//                "\nDrink         : " + drinks.name() +
                "\nTotal Price   : $" + price +
                "\n------------------------------";
    }
}

