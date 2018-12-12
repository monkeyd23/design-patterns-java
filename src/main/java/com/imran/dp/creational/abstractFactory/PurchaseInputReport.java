package com.imran.dp.creational.abstractFactory;

public class PurchaseInputReport extends InputReport {

    PurchaseInputReport(String name) {
        super(name);
    }

    @Override
    public void ProcessReport() {
        super.ProcessReport();
        System.out.println("Performing purchase input operations...");
    }
}
