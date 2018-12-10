package com.imran.dp.creational.factory;

import org.junit.Assert;
import org.junit.Test;

public class FactoryTest {

    @Test
    public void testSimplePersonFactory() {
        SimplePersonFactory personFactory = SimplePersonFactory.getInstance();

        Person alex = personFactory.createPerson(Shopper.class, "Alex");
        Person eve = personFactory.createPerson(Officer.class, "Eve");
        Person simon = personFactory.createPerson(Employee.class, "Simon");

        alex.speak();
        eve.speak();
        simon.speak();

        Assert.assertEquals("Shopper", alex.getClass().getSimpleName());
        Assert.assertEquals("Officer", eve.getClass().getSimpleName());
        Assert.assertEquals("Employee", simon.getClass().getSimpleName());
    }

    @Test
    public void testPersonFactory() {
        IPersonFactory personFactory;

        personFactory = new ShopperFactory();
        Person alex = personFactory.createPerson("Alex");

        personFactory = new OfficerFactory();
        Person eve = personFactory.createPerson("Eve");

        personFactory = new EmployeeFactory();
        Person simon = personFactory.createPerson("Simon");

        alex.speak();
        eve.speak();
        simon.speak();

        Assert.assertEquals("Shopper", alex.getClass().getSimpleName());
        Assert.assertEquals("Officer", eve.getClass().getSimpleName());
        Assert.assertEquals("Employee", simon.getClass().getSimpleName());
    }
}
