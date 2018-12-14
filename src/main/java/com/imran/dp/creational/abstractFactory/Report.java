package com.imran.dp.creational.abstractFactory;

public class Report {

    private String name;

    Report(String name) {
        this.name = name;
    }

    public void ProcessReport() {
        System.out.println("Processing report " + name + "...");
    }
}
