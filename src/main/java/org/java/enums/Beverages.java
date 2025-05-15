package org.java.enums;

public enum Beverages {
    Mojito(100),
    Coke(50),
    Limca(40);

    private int cost;

    Beverages(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
}
