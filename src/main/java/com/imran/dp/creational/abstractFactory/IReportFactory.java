package com.imran.dp.creational.abstractFactory;

interface IReportFactory {
    Report createReport(String reportType, String name);
}
