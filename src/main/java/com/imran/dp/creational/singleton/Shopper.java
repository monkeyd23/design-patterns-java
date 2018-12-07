package com.imran.dp.creational.singleton;

public class Shopper {

    public Shopper(String name, int money) {
        Logger logger = new Logger();
        EnhancedLogger enhancedLogger = EnhancedLogger.getInstance();

        logger.log("New Shopper: " + name + " has " + money + " in their account.");
        enhancedLogger.log("New Shopper: " + name + " has " + money + " in their account.");
    }
}
