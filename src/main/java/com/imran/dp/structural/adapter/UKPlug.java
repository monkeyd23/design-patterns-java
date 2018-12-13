package com.imran.dp.structural.adapter;

public interface UKPlug {

    int VOLTS = 80;

    default int getUKVolts () {
        return VOLTS;
    }
}
