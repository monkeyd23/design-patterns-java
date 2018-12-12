package com.imran.dp.creational.abstractFactory;

public class OutputReportFactory implements IReportFactory {

    @Override
    public Report createReport(String reportType, String name) {
        Report newReport = null;
        switch(reportType) {
            case StringConstants.REPORT_TYPE_INVOICE:
                newReport = new InvoiceOutputReport(name);
                break;
            case StringConstants.REPORT_TYPE_PURCHASE:
                newReport = new PurchaseOutputReport(name);
                break;
            default: break;
        }
        return newReport;
    }
}
