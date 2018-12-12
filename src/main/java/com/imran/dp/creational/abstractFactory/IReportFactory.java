package com.imran.dp.creational.abstractFactory;

public interface IReportFactory {
    Report createReport(String reportType, String name);
}
