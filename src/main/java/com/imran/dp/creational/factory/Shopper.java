package com.imran.dp.creational.factory;

public class Shopper implements Person{

    private String name;

    Shopper(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("I am a shopper");
        System.out.println("My name is " + this.name);
    }
}
