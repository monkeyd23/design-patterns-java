package com.imran.dp.structural.composite;

public abstract class CatalogItem {

    public void add(CatalogItem item) {
        throw new UnsupportedOperationException("Cannot add to abstract");
    }

    public void remove(CatalogItem item) {
        throw new UnsupportedOperationException("Cannot remove from abstract");
    }

    public String getName(){
        throw new UnsupportedOperationException("Cannot get name from abstract");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("Cannot get price from abstract");
    }

    public void print() {
        throw new UnsupportedOperationException("Cannot print abstract");
    }
}
