package com.imran.dp.creational.abstractFactory;

public class InvoiceOutputReport extends OutputReport {

    InvoiceOutputReport(String name) {
        super(name);
    }

    @Override
    public void ProcessReport() {
        super.ProcessReport();
        System.out.println("Performing invoice output operations...");
    }
}
