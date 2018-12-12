package com.imran.dp.creational.abstractFactory;

public class InputReport extends Report {

    InputReport(String name) {
        super(name);
    }

    @Override
    public void ProcessReport() {
        super.ProcessReport();
        System.out.println("Performing input operations...");
    }
}
