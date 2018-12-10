package com.imran.dp.creational.prototype;

import org.junit.Assert;
import org.junit.Test;

public class PrototypeTest {

    @Test
    public void TestObjectCreationWithoutPrototypes() {
        Shopper alex = new Shopper("Alex Banks");
        alex.addItemToList("camping knife");
        alex.addItemToList("tent");
        alex.addItemToList("backpack");
        alex.addItemToList("map");
        alex.addItemToList("slingshot");

        Shopper eve = new Shopper("Eve Porcello");
        eve.addItemToList("camping knife");
        eve.addItemToList("tent");
        eve.addItemToList("backpack");
        eve.addItemToList("map");
        eve.addItemToList("reading light");

        Assert.assertEquals(5, alex.getShoppingList().size());
        Assert.assertEquals(5, eve.getShoppingList().size());
    }

    @Test
    public void TestObjectCreationWithPrototypes() {
        Shopper alex = (Shopper) PrototypeManager.getPrototype("Shopper");
        Shopper eve = (Shopper) PrototypeManager.getPrototype("Shopper");

        alex.setName("Alex");
        alex.addItemToList("slingshot");

        eve.setName("Eve");
        eve.addItemToList("reading light");

        Assert.assertEquals(5, alex.getShoppingList().size());
        Assert.assertEquals(5, eve.getShoppingList().size());
    }
}
