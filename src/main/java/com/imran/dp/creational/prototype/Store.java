package com.imran.dp.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Store implements ProtoTypeCompatible {

    private String name;
    private List<String> inventory;

    Store(String name) {
        this.name = name;
        inventory = new ArrayList<>();
    }

    void addItemToList(String item) {
        this.inventory.add(item);
    }

    @Override
    public Store clonePrototype() throws CloneNotSupportedException {
        Store newStore = (Store) super.clone();
        newStore.name = this.name;
        newStore.inventory = new ArrayList<>(this.inventory);
        return newStore;
    }
}
