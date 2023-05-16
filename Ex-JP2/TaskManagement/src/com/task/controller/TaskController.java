package com.task.controller;

import com.task.Task;
import com.task.Type;
import com.task.util.DBUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class TaskController {
    public boolean addTask(Task task) {
        Connection conn = null;
        CallableStatement stmt = null;
        boolean iSuccessful = false;
        try {
            conn = DBUtil.getConnection();
            stmt = conn.prepareCall("{call addTask(?,?,?,?,?,?)}");
            stmt.setString(1, task.getName());
            stmt.setInt(2, task.getId());
            stmt.setString(3, task.getDate());
            stmt.setFloat(4, task.getTime());
            stmt.setString(5, task.getAssignee());
            stmt.setString(6, task.getReviewer());
            stmt.executeUpdate();
            iSuccessful = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return iSuccessful;
    }

    public boolean deleteTask(Task task) {
        Connection conn = null;
        CallableStatement stmt = null;
        boolean iSuccessful = false;
        try {
            conn = DBUtil.getConnection();
            stmt = conn.prepareCall("{call deleteTask(?)}");
            stmt.setInt(1, task.getId());
            stmt.executeUpdate();
            iSuccessful = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return iSuccessful;
    }

    public static Map<Integer,Task> displayTask() {
        Map<Integer, Task> taskMap = new HashMap<>();
        Connection conn = null;
        CallableStatement stmt = null;
        try {
            conn = DBUtil.getConnection();
            stmt = conn.prepareCall("{call displayTask}");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                int type = rs.getInt(3);
                String date = rs.getString(4);
                float time = rs.getFloat(5);
                String assignee = rs.getString(6);
                String reviewer = rs.getString(7);
                Task task = new Task(id, name, type, date, time, assignee, reviewer);
                taskMap.put(id, task);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return taskMap;
    }
}
