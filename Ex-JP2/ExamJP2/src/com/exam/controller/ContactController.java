package com.exam.controller;

import com.exam.Contact;
import com.exam.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContactController {
    List<Contact> contacts = new ArrayList<>();
    public void addNewContact(Contact contact) throws Exception {
        try {
            Connection conn = DBUtil.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(
                    "INSERT INTO Contact(Name, Company, Email, Phone) VALUES (?, ?, ?, ?)"
            );

            pstmt.setString(1, contact.getName());
            pstmt.setString(2, contact.getCompany());
            pstmt.setString(3, contact.getEmail());
            pstmt.setString(4, contact.getPhone());

            int updated = pstmt.executeUpdate();
            if (updated > 0) {
                System.out.println("Insert Contact success!!!");
            }

            pstmt.close();
            conn.close();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public static List<Contact> getContacts() {
        Connection conn = null;
        Statement stmt = null;
        List<Contact> contactList = new ArrayList<>();

        try {
            conn = DBUtil.getConnection();
            stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM Contacts");
            while (rs.next()) {
                String name = rs.getString(2);
                String company = rs.getString(3);
                String email = rs.getString(4);
                String phoneNumber = rs.getString(5);
                Contact contact = new Contact(name, company, email, phoneNumber);
                contactList.add(contact);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return contactList;
    }

    public void displayContacts() {
        try {
            Connection conn = DBUtil.getConnection();

            Statement stmt = conn.createStatement();

            ResultSet rs
                    = stmt.executeQuery("SELECT * FROM Contact");

            while (rs.next()) {
                Contact contact = new Contact(
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4)
                );

                contacts.add(contact);

            }

            System.out.println("=".repeat(130));
            System.out.printf("| %-20s | %-20s | %-25s | %-25s\n", "NAME", "COMPANY", "EMAIL", "PHONE");
            System.out.println("=".repeat(130));
            for (Contact contact  : contacts) {
                System.out.printf("| %-20s | %-20s | %-25s | %-25s\n", contact.getName(), contact.getCompany(), contact.getEmail(), contact.getPhone());
                System.out.println("-".repeat(130));
            }
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
