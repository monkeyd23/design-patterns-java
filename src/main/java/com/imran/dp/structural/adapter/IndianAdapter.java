package com.imran.dp.structural.adapter;

public class IndianAdapter implements IndianPlug {

    private GermanPlug germanPlug;
    private UKPlug ukPlug;

    IndianAdapter(GermanPlug germanPlug) {
        this.germanPlug = germanPlug;
    }

    IndianAdapter(UKPlug ukPlug) {
        this.ukPlug = ukPlug;
    }

    @Override
    public int getIndianVolts() {
        int volts = 0;

        if(this.germanPlug != null)
            return germanPlug.getGermanVolts();

        if(this.ukPlug != null)
            return ukPlug.getUKVolts();

        return volts;
    }
}
