package com.imran.dp.structural.adapter;

interface IndianPlug {
    int VOLTS = 240;

    default int getIndianVolts () {
        return VOLTS;
    }
}
