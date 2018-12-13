package com.imran.dp.structural.composite;

public class Product extends CatalogItem {
    private String name;
    private Double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Product Name: " + name + ". Product Price: " + price + ".");
    }
}
