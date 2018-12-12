package com.imran.dp.creational.abstractFactory;

class ReportFactoryProvider {

    static IReportFactory getReportFactory(String factoryType) {

        IReportFactory reportFactory = null;
        switch(factoryType) {
            case StringConstants.FACTORY_TYPE_INPUT:
                reportFactory = new InputReportFactory();
                break;
            case StringConstants.FACTORY_TYPE_OUTPUT:
                reportFactory = new OutputReportFactory();
                break;
        }

        return reportFactory;
    }
}
