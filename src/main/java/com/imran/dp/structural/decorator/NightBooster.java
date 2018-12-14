package com.imran.dp.structural.decorator;

public class NightBooster extends PlanBooster {

    public NightBooster(DataPlan dataPlan) {
        this.dataPlan = dataPlan;
        name = "Night Booster Plan";
        description = "100 MB/s from 8PM to 6AM";
        cost = this.dataPlan.cost + 300;
    }
}
