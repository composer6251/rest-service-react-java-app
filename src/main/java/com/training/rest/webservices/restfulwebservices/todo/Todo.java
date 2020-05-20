package com.training.rest.webservices.restfulwebservices.todo;

import java.util.Date;

public class Todo {

    private long id;
    private String username;
    private Date targetDate;
    private String description;
    private boolean isDone;

    public Todo(long id, String username, Date targetDate, String description, boolean isDone) {
        this.id = id;
        this.username = username;
        this.targetDate = targetDate;
        this.description = description;
        this.isDone = isDone;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    public long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

}
