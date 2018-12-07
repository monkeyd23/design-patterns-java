package com.imran.dp.creational.prototype;

public class App {

    public static void main(String ...args) {

        // Code without prototype
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

        System.out.println(alex);
        System.out.println(eve);
    }
}
