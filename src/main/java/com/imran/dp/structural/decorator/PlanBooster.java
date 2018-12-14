package com.imran.dp.structural.decorator;

public abstract class PlanBooster extends DataPlan {
    DataPlan dataPlan;

    @Override
    public void showDetails(){
        System.out.println("Base Plan Name: " + dataPlan.name);
        System.out.println("Booster Name: " + name);

        System.out.println("Base Plan Description: " + dataPlan.description);
        System.out.println("Booster Description: " + description);

        System.out.println("Cost: " + cost);
    }
}
