package com.imran.dp.creational.factory;

public class OfficerFactory implements IPersonFactory {

    @Override
    public Person createPerson(String name) {
        return new Officer(name);
    }
}
