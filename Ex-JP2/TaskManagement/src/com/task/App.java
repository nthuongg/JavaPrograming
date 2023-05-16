package com.task;

import com.task.controller.TaskController;
import com.task.controller.TypeController;

import java.util.HashMap;
import java.util.Map;

public class App {
    private Map<Integer, Type> typeMap;
    private Map<Integer, Task> taskMap;
    private String name;

    public App() {
        typeMap = TypeController.displayType();
        taskMap = TaskController.displayTask();
    }

    public boolean addType(Type type) {
        TypeController.addType(type);
    }
}
