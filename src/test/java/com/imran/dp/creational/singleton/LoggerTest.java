package com.imran.dp.creational.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class LoggerTest {

    @Test
    public void TestMultiInstanceLogger() {
        Logger logger = new Logger();

        logger.log("Starting Test Case for Logger");

        Shopper alex = new Shopper("alex", 500);
        Store skiShop = new Store("Steep and Deep Supplies", Arrays.asList("Downhill Skis", "Knit Hat"));

        Assert.assertEquals(1, logger.getCount());
        Assert.assertEquals(1, logger.getLogs().size());
    }

    @Test
    public void TestSingletonLogger() {
        EnhancedLogger enhancedLogger = EnhancedLogger.getInstance();

        enhancedLogger.log("Starting Test Case for Logger");

        Shopper alex = new Shopper("alex", 500);
        Store skiShop = new Store("Steep and Deep Supplies", Arrays.asList("Downhill Skis", "Knit Hat"));

        Assert.assertEquals(3, enhancedLogger.getCount());
        Assert.assertEquals(3,enhancedLogger.getLogs().size());
    }
}
