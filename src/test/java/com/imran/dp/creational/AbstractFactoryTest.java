package com.imran.dp.creational;

import com.imran.dp.creational.abstractFactory.ReportQueue;
import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void TestReportQueue() {

        ReportQueue reportQueue = new ReportQueue();

        String[] reports = {"IN_INV_001.txt","OUT_PUR_001.txt","IN_INV_002.txt", "IN_PUR_001.txt", "OUT_PUR_002.txt", "OUT_INV_001.txt", "IN_INV_003.txt"};
        String[] tmp;

        for (String report : reports) {
            tmp = report.split("_");
            reportQueue.addReport(tmp[0], tmp[1], report);
        }

        Assert.assertEquals(7, reportQueue.getReports().size());

        reportQueue.processReports();

        Assert.assertEquals(0, reportQueue.getReports().size());
    }
}
