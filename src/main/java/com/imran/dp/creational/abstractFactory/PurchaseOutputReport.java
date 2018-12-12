package com.imran.dp.creational.abstractFactory;

public class PurchaseOutputReport extends OutputReport{

    PurchaseOutputReport(String name){
        super(name);
    }

    @Override
    public void ProcessReport() {
        super.ProcessReport();
        System.out.println("Performing purchase output operations...");
    }
}
