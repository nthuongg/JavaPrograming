package com.class1;

import java.util.Scanner;

public class Customer {
    int id;
    String name;
    String city;
    String country;
    String phone;
    String email;

    public Customer() {

    }

    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        this.name = input.nextLine();
        System.out.println("Enter city");
        this.city = input.nextLine();
        System.out.println("Enter country");
        this.country = input.nextLine();
        System.out.println("Enter phone");
        this.phone = input.nextLine();
        System.out.println("Enter email");
        this.email = input.nextLine();

    }

    public Customer(int id, String name, String city, String country, String phone, String email) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.country = country;
        this.phone = phone;
        this.email = email;
    }
    public Customer(String name, String city, String country, String phone, String email) {
        this.id = 0;
        this.name = name;
        this.city = city;
        this.country = country;
        this.phone = phone;
        this.email = email;
    }



    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
