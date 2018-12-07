package com.imran.dp.creational.prototype;

import java.util.HashMap;
import java.util.Map;

class PrototypeManager {

    private static Map<String, ProtoTypeCompatible> prototypes;

    static {
        prototypes = new HashMap<>();

        buildShopperPrototype();
        buildStorePrototype();
    }

    private static void buildShopperPrototype() {
        Shopper shopperPrototype =  new Shopper("Placeholder Name");
        shopperPrototype.addItemToList("camping knife");
        shopperPrototype.addItemToList("tent");
        shopperPrototype.addItemToList("backpack");
        shopperPrototype.addItemToList("map");
        prototypes.put("Shopper", shopperPrototype);
    }

    private static void buildStorePrototype() {
        Store storePrototype =  new Store("Joe's Camping Shop");
        storePrototype.addItemToList("camping knife");
        storePrototype.addItemToList("tent");
        storePrototype.addItemToList("backpack");
        storePrototype.addItemToList("map");
        prototypes.put("Store", storePrototype);
    }

    static ProtoTypeCompatible getPrototype(String className) {
        ProtoTypeCompatible clonedPrototype = null;

        try {
            clonedPrototype = prototypes.get(className).clonePrototype();
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        }

        return clonedPrototype;
    }

    private PrototypeManager() {}

}
