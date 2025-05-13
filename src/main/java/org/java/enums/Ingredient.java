package org.java.enums;

public enum Ingredient {
    Jalepeo(25),
    Cheese(50),
    Panner(50),
    Chicken(60);
    private int cost;

    //Agar hum constructor nahii banayenge toh enum mai error ata hai agar value hua toh since data type samjhna chaiye
    // function maii enum nahii pass kar sakte variable chaiye rehta haii
    Ingredient(int cost) {
        this.cost = cost;
    }

    //enum compile time ke time pe execute hoga
    // hashmap run time ke time pe agar hashmap maii error hua toh code production mai phat jayega
    public int getCost() {
        return cost;
    }
}


