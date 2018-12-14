package com.imran.dp.structural.composite;

import java.util.LinkedList;
import java.util.List;

public class Catalog extends CatalogItem {

    private String name;
    private List<CatalogItem> items = new LinkedList<>();

    public Catalog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void add(CatalogItem item) {
        items.add(item);
    }

    @Override
    public void remove(CatalogItem item) {
        items.remove(item);
    }

    @Override
    public void print() {
        System.out.println("Printing catalog " + name);
        items.forEach(CatalogItem::print);
    }
}
