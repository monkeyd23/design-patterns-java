package com.imran.dp.creational.factory;

public class Employee implements Person {

    private String name;

    Employee(String name) {
        this.name = name;
    }

    @Override
    public void speak() {
        System.out.println("I am an employee");
        System.out.println("My name is " + this.name);
    }
}
