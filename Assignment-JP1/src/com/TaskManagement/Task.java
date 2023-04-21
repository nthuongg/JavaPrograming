package com.TaskManagement;

import java.util.Date;

public class Task {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class SmallTask {
    private int id;
    private String name;
    private String type;
    private Date date;
    private double time;
    private String assignee;
    private String reviewer;
    
}