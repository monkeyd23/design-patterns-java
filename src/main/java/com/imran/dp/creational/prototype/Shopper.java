package com.imran.dp.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Shopper implements ProtoTypeCompatible {

    private String name;
    private List<String> shoppingList;

    public Shopper(String name) {
        shoppingList = new ArrayList<>();
        this.name = name;
    }

    public void addItemToList(String item) {
        this.shoppingList.add(item);
    }

    public String toString() {
        StringBuilder returnString = new StringBuilder(this.name + " ==> { ");
        for(String item : this.shoppingList) {
            returnString.append(item).append(", ");
        }
        returnString.replace(returnString.lastIndexOf(", "), returnString.length(), ". }");
        return returnString.toString();
    }

    @Override
    public Shopper clonePrototype() throws CloneNotSupportedException {
        Shopper newShopper = (Shopper) super.clone();
        newShopper.name = this.name;
        newShopper.shoppingList = new ArrayList<>(this.shoppingList);
        return newShopper;
    }

    public List<String> getShoppingList() {
        return this.shoppingList;
    }

    public void setName(String name) {
        this.name = name;
    }
}
