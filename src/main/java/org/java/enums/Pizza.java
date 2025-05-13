package org.java.enums;

public enum Pizza {
    CheeseBurst(400),
    Farmhouse(450);

    private int cost;

    Pizza(int cost){
        this.cost = cost;
    }

    public int getCost(){
        return cost;
    }
}

