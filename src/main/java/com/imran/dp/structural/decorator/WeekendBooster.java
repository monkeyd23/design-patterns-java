package com.imran.dp.structural.decorator;

public class WeekendBooster extends PlanBooster{

    public WeekendBooster(DataPlan dataPlan) {
        this.dataPlan = dataPlan;
        name = "Weekend Booster Plan";
        description = "100 MB/s from Friday to Sunday";
        cost = this.dataPlan.cost + 200 ;
    }
}
