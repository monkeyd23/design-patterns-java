package com.imran.dp.structural.decorator;

class WeekdayBooster extends PlanBooster {

    WeekdayBooster(DataPlan dataPlan) {
        this.dataPlan = dataPlan;
        name = "Weekend Booster Plan";
        description = "100 MB/s from Monday to Thursday";
        cost = this.dataPlan.cost + 500 ;
    }
}
