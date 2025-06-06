package org.java.enums;

public enum Type {
    Large(200),
    Medium(100),
    Small(50);

    private int cost;

    Type(int cost){
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

}
