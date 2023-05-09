package com.class1.controller;

import com.class1.Customer;
import com.class1.util.DBUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerController {
    List<Customer> customers = new ArrayList<>();
    public void addNewCustomer(Customer customer) throws Exception {
        try {
            Connection conn = DBUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(
                    "INSERT INTO Customer(Name, City, Country, Phone, Email) VALUES (?, ?, ?, ?, ?)"
            );

            pstmt.setString(1, customer.getName());
            pstmt.setString(2, customer.getCity());
            pstmt.setString(3, customer.getCountry());
            pstmt.setString(4, customer.getPhone());
            pstmt.setString(5, customer.getEmail());

            int updated = pstmt.executeUpdate();
            if (updated > 0) {
                System.out.println("Insert Customer success!!!");
            }

            pstmt.close();
            conn.close();
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void getAllCustomers() {
        try {
            //1. Register JDBC
            Connection conn = DBUtil.getConnection();

            //3. Create statement
            Statement stmt = conn.createStatement();

            //4. Execute Statement
            ResultSet rs
                    = stmt.executeQuery("select * from Customer");

            while (rs.next()) {
                Customer customer = new Customer(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );

                customers.add(customer);

            }

            System.out.println("=".repeat(130));
            System.out.printf("| %-10s | %-25s | %-20s | %-20s | %-20s | %-25s\n", "ID", "NAME", "CITY", "COUNTRY", "PHONE", "EMAIL");
            System.out.println("=".repeat(130));
            for (Customer customer  : customers) {
                System.out.printf("| %-10s | %-25s | %-20s | %-20s | %-20s | %-25s\n",customer.getId(), customer.getName(), customer.getCity(), customer.getCountry(), customer.getPhone(), customer.getEmail());
                System.out.println("-".repeat(130));
            }

            rs.close();
            stmt.close();
            conn.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Customer getCustomerById(int id) throws Exception {
        Customer customer = null;
        try {
            Connection conn = DBUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(
                    "select * from Customer where CustomerId = ?"
            );
            pstmt.setInt(1,id);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                customer = new Customer(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
            }
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return customer;
    }

    public Customer getCustomerByIdStored(int id) throws Exception {
        Customer customer = null;

        try {
            Connection conn = DBUtil.getConnection();
            CallableStatement cstmt = conn.prepareCall("{call spGetCustomer(?)}");

            cstmt.setInt(1,id);

            ResultSet rs = cstmt.executeQuery();
            if (rs.next()) {
                customer = new Customer(
                        rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6)
                );
            }
        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return customer;
    }

    public void updateCustomer(int id) throws Exception {
        try {
            Customer updatingCustomer = this.getCustomerById(id);
            if (updatingCustomer != null) {
                //input new data of Customer
                updatingCustomer.inputData();
                // UPDATE Customer into Database

                Connection conn = DBUtil.getConnection();
                PreparedStatement pstmt = conn.prepareStatement(
                        "UPDATE Customer SET Name = ?, City = ?, Country = ?, Phone = ?, Email = ? where CustomerId = ?"
                );
                pstmt.setString(1, updatingCustomer.getName());
                pstmt.setString(2, updatingCustomer.getCity());
                pstmt.setString(3, updatingCustomer.getCountry());
                pstmt.setString(4, updatingCustomer.getPhone());
                pstmt.setString(5, updatingCustomer.getEmail());
                pstmt.setInt(6, updatingCustomer.getId());

                int updated = pstmt.executeUpdate();
                if (updated > 0) {
                    System.out.println("Update Customer success !!!");
                }

                pstmt.close();
                conn.close();
            } else  {
                System.out.println("Customer not found");
            }

        }catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public void deleteCustomer(int id) throws Exception{
        try {
            Connection conn = DBUtil.getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement("delete from Customer where CustomerId = ?");
            preparedStatement.setInt(1, id);

            int update = preparedStatement.executeUpdate();
            if (update == 1){
                System.out.println("Deleted customer successfully");
            }
            preparedStatement.close();
            conn.close();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
