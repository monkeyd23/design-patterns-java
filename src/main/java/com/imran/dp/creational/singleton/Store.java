package com.imran.dp.creational.singleton;

import java.util.List;

public class Store {

    public Store(String name, List<String> inventory) {
        Logger logger = new Logger();
        EnhancedLogger enhancedLogger = EnhancedLogger.getInstance();

        logger.log("New Store: " + name + " has " + inventory.size() + " items in stock.");
        enhancedLogger.log("New Store: " + name + " has " + inventory.size() + " items in stock.");
    }
}
