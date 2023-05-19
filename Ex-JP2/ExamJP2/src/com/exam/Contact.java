package com.exam;

import java.util.Scanner;

public class Contact {
    String name;
    String company;
    String email;
    String phone;

    public Contact(String name, String company, String email, String phone) {
        this.name = name;
        this.company = company;
        this.email = email;
        this.phone = phone;
    }

    public Contact() {

    }

    public void inputData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        this.name = scanner.nextLine();
        System.out.println("Enter company: ");
        this.company = scanner.nextLine();
        System.out.println("Enter email");
        this.email = scanner.nextLine();
        System.out.println("Enter phone number: ");
        this.phone = scanner.nextLine();
    }

    public void display() {
        System.out.printf("| %-20s | %-20s | %-20s | %-25s\n", name, company, email, phone);
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


}
