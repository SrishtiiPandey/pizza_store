package org.java.enums;

public enum Type {
    Large(300),
    Medium(200),
    Small(100);

    private int cost;

    Type(int cost){
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

}
