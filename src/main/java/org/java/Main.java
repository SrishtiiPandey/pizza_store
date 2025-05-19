package org.java;


import org.java.enums.*;
import org.java.models.Cart;
import org.java.models.Menu;
import org.java.models.Meal;
import org.java.models.Pizza;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        //Creating instance of class menu
        Menu menu = new Menu() {};

        //Printing the menu , using for loop for it
        System.out.println("--------- MENU ---------");
        for (Meal meal : menu.getMeals()) {
            System.out.println(meal);
        }
        System.out.println("------------------------");


    }
}


