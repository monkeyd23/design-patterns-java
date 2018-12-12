package com.imran.dp.creational.abstractFactory;

public class OutputReport extends Report {

    OutputReport(String name) {
        super(name);
    }

    @Override
    public void ProcessReport() {
        super.ProcessReport();
        System.out.println("Performing output operations...");
    }
}
