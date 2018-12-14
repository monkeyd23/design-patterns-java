package com.imran.dp.structural;

import com.imran.dp.structural.decorator.*;
import org.junit.Test;

public class TestDecorator {

    @Test
    public void testDataPlan() {

        // Provide base plans
        DataPlan plan1 = new SilverPlan();
        DataPlan plan2 = new GoldPlan();

        // Give addons
        plan1 = new WeekdayBooster(plan1);
        plan1 =  new NightBooster(plan1);

        plan2 = new WeekdayBooster(plan2);
        plan2 = new WeekendBooster(plan2);

        // Print
        plan1.showDetails();
        plan2.showDetails();
    }
}
