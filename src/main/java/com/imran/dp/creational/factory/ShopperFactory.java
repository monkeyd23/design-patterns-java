package com.imran.dp.creational.factory;

public class ShopperFactory implements IPersonFactory {

    @Override
    public Person createPerson(String name) {
        return new Shopper(name);
    }
}
