package com.imran.dp.creational.abstractFactory;

import java.util.LinkedList;
import java.util.List;

public class ReportQueue {

    private List<Report> reports;

    public void addReport(String factoryType, String reportType, String name) {
        IReportFactory reportFactory = ReportFactoryProvider.getReportFactory(factoryType);
        if(this.reports == null) {
            this.reports = new LinkedList<>();
        }
        this.reports.add(reportFactory.createReport(reportType, name));
    }

    public void processReports() {
        this.reports.forEach(report -> {
            report.ProcessReport();
            System.out.println("------------------- Processsing Completed -------------------");
        });
        this.reports.clear();
    }

    public List<Report> getReports() {
        return reports;
    }
}
