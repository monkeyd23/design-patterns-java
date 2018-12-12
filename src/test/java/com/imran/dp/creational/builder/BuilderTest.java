package com.imran.dp.creational.builder;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class BuilderTest {

    @Test
    public void testTaskBuilder() {
        Task task = new TaskBuilder(5)
                        .setDescription("Test Description")
                        .setSummary("Test Summary")
                        .setDone(true)
                        .setDueDate(new Date())
                        .build();

        Assert.assertTrue(task.isDone());
        Assert.assertEquals(5, task.getId());
        Assert.assertEquals("Test Description", task.getDescription());
        Assert.assertEquals("Test Summary", task.getSummary());
        Assert.assertEquals(new Date(), task.getDueDate());
    }
}
