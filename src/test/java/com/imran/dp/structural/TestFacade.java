package com.imran.dp.structural;

import com.imran.dp.structural.facade.OrderServiceFacade;
import com.imran.dp.structural.facade.OrderServiceImpl;
import org.junit.Assert;
import org.junit.Test;

public class TestFacade {

    @Test
    public void testOrderServiceFacade() {
        OrderServiceFacade orderService =  new OrderServiceImpl();
        Assert.assertTrue(orderService.placeOrder("PRD-311-TRF"));
    }
}
