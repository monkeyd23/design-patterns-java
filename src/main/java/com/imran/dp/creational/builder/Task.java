package com.imran.dp.creational.builder;

import java.util.Date;

class Task {

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

    boolean isDone() {
        return done;
    }

    long getId() {
        return id;
    }

    String getSummary() {
        return summary;
    }

    String getDescription() {
        return description;
    }

    Date getDueDate() {
        return dueDate;
    }
}
