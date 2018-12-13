package com.imran.dp.structural.adapter;

public interface GermanPlug {

    int VOLTS = 120;

    default int getGermanVolts () {
        return VOLTS;
    }
}
