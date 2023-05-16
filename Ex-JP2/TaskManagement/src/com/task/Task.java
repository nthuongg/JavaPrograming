package com.task;

import java.io.Serializable;

public class Task {
    private int id;
    private String name;
    private int type;
    private String date;
    private float time;
    private String assignee;
    private String reviewer;

    public Task(int id, String name, int type, String date, float time, String assignee, String reviewer) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.date = date;
        this.time = time;
        this.assignee = assignee;
        this.reviewer = reviewer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public String getDate() {
        return date;
    }

    public float getTime() {
        return time;
    }

    public String getAssignee() {
        return assignee;
    }

    public String getReviewer() {
        return reviewer;
    }
}
