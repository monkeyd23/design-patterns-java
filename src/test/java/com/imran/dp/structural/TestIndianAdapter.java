package com.imran.dp.structural;

import com.imran.dp.structural.adapter.GermanPlug;
import com.imran.dp.structural.adapter.IndianAdapter;
import com.imran.dp.structural.adapter.IndianSocket;
import com.imran.dp.structural.adapter.UKPlug;
import org.junit.Assert;
import org.junit.Test;

public class TestIndianAdapter {

    @Test
    public void testIndianAdapter () {

        // Get german plug and UK Plug
        GermanPlug germanPlug =  new GermanPlug() {};
        UKPlug ukPlug =  new UKPlug() {};

        // But you have indian socket
        IndianSocket indianSocket =  new IndianSocket();

        // Plug the german plug into the adapter
        IndianAdapter adapter = new IndianAdapter(germanPlug);

        // Check if you get proper output by using the adapter
        Assert.assertEquals(GermanPlug.VOLTS, indianSocket.plugIn(adapter));

        // Plug the uk plug into adapter
        adapter = new IndianAdapter(ukPlug);

        // Check if you get proper output by using the adapter
        Assert.assertEquals(UKPlug.VOLTS, indianSocket.plugIn(adapter));
    }
}
