package com.imran.dp.creational.factory;

public class Officer implements Person{

    private String name;

    Officer(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("I am an officer");
        System.out.println("My name is " + this.name);
    }

}
