package org.java.enums;

public enum Pizza {
    CheeseBurst(100),
    Farmhouse(70),
    Margreta(45);

    private int cost;


    Pizza(int cost){
        this.cost = cost;
    }

    public int getCost(){
        return cost;
    }
}

