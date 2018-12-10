package com.imran.dp.creational.factory;

public class EmployeeFactory implements IPersonFactory {

    @Override
    public Person createPerson(String name) {
        return new Employee(name);
    }
}
