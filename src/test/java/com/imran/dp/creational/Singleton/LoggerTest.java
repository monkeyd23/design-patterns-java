package com.imran.dp.creational.Singleton;

import com.imran.dp.creational.singleton.EnhancedLogger;
import com.imran.dp.creational.singleton.Logger;
import com.imran.dp.creational.singleton.Shopper;
import com.imran.dp.creational.singleton.Store;
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

        Assert.assertEquals(logger.getCount(), 1);
        Assert.assertEquals(logger.getLogs().size(), 1);
    }

    @Test
    public void TestSingletonLogger() {
        EnhancedLogger enhancedLogger = EnhancedLogger.getInstance();

        enhancedLogger.log("Starting Test Case for Logger");

        Shopper alex = new Shopper("alex", 500);
        Store skiShop = new Store("Steep and Deep Supplies", Arrays.asList("Downhill Skis", "Knit Hat"));

        Assert.assertEquals(enhancedLogger.getCount(), 3);
        Assert.assertEquals(enhancedLogger.getLogs().size(), 3);
    }
}
