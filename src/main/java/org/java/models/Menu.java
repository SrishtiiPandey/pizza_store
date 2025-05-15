package org.java.models;
import org.java.enums.Beverages;
import org.java.enums.Ingredient;
import org.java.enums.Type;
import java.util.ArrayList;
import java.util.List;

public class Menu {

    private int price;
    private List<Ingredient> topping = new ArrayList<>();
    private Type type;
    private List<Menu> menu = new ArrayList<>();
    private List<Meal> meal = new ArrayList<>();

    private static List<Ingredient> ingredients = new ArrayList<>();


    Pizza pizza = new Pizza(org.java.enums.Pizza.CheeseBurst, topping);


    Meal meal = new Meal();

    public static void main(String[] args) {
        ingredients.add(Ingredient.Panner);
    }
    //Constructor
    public Menu(List<Ingredient> topping, Type type, Pizza pizza, Beverages drinks) {
        this.price = type.getCost() + topping.stream().mapToInt(Ingredient::getCost).sum() + drinks.getCost() + pizza.getCost();
        this.topping = topping;
        this.type = type;
        this.pizza = pizza;
        this.drinks = drinks;
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
                "\nPizza         : " + pizza.getName().name() +
                "\nBase          : " + pizza.getBase().name() +
                "\nPizza Toppings: " + pizza.getIngredients().stream().map(Enum::name).toList() +
                "\nSize (Type)   : " + type.name() +
                "\nExtra Toppings: " + topping.stream().map(Enum::name).toList() +
                "\nDrink         : " + drinks.name() +
                "\nTotal Price   : $" + price +
                "\n------------------------------";
    }
}
