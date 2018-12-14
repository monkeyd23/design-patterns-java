package com.imran.dp.creational.builder;

import java.util.Date;

public class Task {

    private final long id;
    private String summary;
    private String description;
    private boolean done;
    private Date dueDate;

    Task(long id, String summary, String description, boolean done, Date dueDate) {
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.done = done;
        this.dueDate = dueDate;
    }

    public boolean isDone() {
        return done;
    }

    public long getId() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public String getDescription() {
        return description;
    }

    public Date getDueDate() {
        return dueDate;
    }
}
