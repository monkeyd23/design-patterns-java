package com.imran.dp.creational.abstractFactory;

public class InputReportFactory implements IReportFactory {

    @Override
    public Report createReport(String reportType, String name) {
        Report newReport = null;

        switch(reportType) {
            case StringConstants.REPORT_TYPE_INVOICE:
                newReport = new InvoiceInputReport(name);
                break;
            case StringConstants.REPORT_TYPE_PURCHASE:
                newReport = new PurchaseInputReport(name);
                break;
            default: break;
        }
        return newReport;
    }
}
