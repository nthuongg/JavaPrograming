package com.task.controller;

import com.task.Type;
import com.task.util.DBUtil;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class TypeController {
    public static boolean addType(Type type) {
        Connection conn = null;
        CallableStatement stmt = null;
        boolean iSuccessful = false;
        try {
            conn = DBUtil.getConnection();
            stmt = conn.prepareCall("{call addType(?)}");
            stmt.setString(1, type.getName());
            stmt.executeUpdate();
            iSuccessful = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return iSuccessful;
    }

    public static boolean deleteType(Type type) {
        Connection conn = null;
        CallableStatement stmt = null;
        boolean iSuccessful = false;
        try {
            conn = DBUtil.getConnection();
            stmt = conn.prepareCall("{call deleteType(?)}");
            stmt.setInt(1, type.getId());
            stmt.executeUpdate();
            iSuccessful = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return iSuccessful;
    }

    public static Map<Integer,Type> displayType() {
        Map<Integer, Type> typeMap = new HashMap<>();
        Connection conn = null;
        CallableStatement stmt = null;
        try {
            conn = DBUtil.getConnection();
            stmt = conn.prepareCall("{call displayType}");

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                Type type = new Type(id, name);
                typeMap.put(id, type);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return typeMap;
    }
}
