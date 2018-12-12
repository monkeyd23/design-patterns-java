package com.imran.dp.creational.builder;

import java.util.Date;

class TaskBuilder {

    private final long id;
    private String summary = "";
    private String description = "";
    private boolean done = false;
    private Date dueDate;

    TaskBuilder(long id) {
        this.id = id;
    }

    TaskBuilder setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    TaskBuilder setDescription(String description) {
        this.description = description;
        return this;
    }

    TaskBuilder setDone(boolean done) {
        this.done = done;
        return this;
    }

    TaskBuilder setDueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    Task build() {
        return new Task(id, summary, description, done, dueDate);
    }
}
