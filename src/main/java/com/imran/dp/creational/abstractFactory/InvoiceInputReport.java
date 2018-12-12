package com.imran.dp.creational.abstractFactory;

public class InvoiceInputReport extends InputReport {

    InvoiceInputReport(String name) {
        super(name);
    }

    @Override
    public void ProcessReport() {
        super.ProcessReport();
        System.out.println("Performing invoice input operations...");
    }
}
