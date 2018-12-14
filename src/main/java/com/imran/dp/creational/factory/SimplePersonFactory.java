package com.imran.dp.creational.factory;

public class SimplePersonFactory {

    // Class types
    private static final String CLASS_NAME_SHOPPER = "Shopper";
    private static final String CLASS_NAME_OFFICER = "Officer";
    private static final String CLASS_NAME_EMPLOYEE = "Employee";

    // private constructor
    private SimplePersonFactory() {}

    // LazyHolder for Thread safe
    private static class LazyHolder {
        private static final SimplePersonFactory INSTANCE = new SimplePersonFactory();
    }

    // public getInstance() method
    public static SimplePersonFactory getInstance() {
        return  SimplePersonFactory.LazyHolder.INSTANCE;
    }

    // public createPerson
    public Person createPerson(Class personType, String name) {

        Person person = null;

        switch (personType.getSimpleName()) {
            case CLASS_NAME_SHOPPER:
                person = new Shopper(name);
                break;
            case CLASS_NAME_OFFICER:
                person = new Officer(name);
                break;
            case CLASS_NAME_EMPLOYEE:
                person = new Employee(name);
                break;
            default:
                break;
        }

        return person;
    }

}
