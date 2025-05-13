package org.java.enums;

public enum Base {
    WHEAT(90),
    MAIDA(40),
    GLUTENFREE(200);

    private int cost;

    Base(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

}
