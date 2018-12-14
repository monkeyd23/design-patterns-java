package com.imran.dp.structural.decorator;

public abstract class DataPlan {
    String name;
    String description;
    double cost;

    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
        System.out.println("Cost: " + cost);
    }
}
