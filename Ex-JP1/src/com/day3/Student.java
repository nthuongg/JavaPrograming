package com.day3;

public class Student extends Person {
    String email;
    String rollNumber;

    Student() {
        super();
        this.email = "";
        this.rollNumber = "";
    }

    Student(String name, int age, int money, String email, String roll) {
        super(name, age, money);
        this.email = email;
        this.rollNumber = roll;
    }

    public void display() {
        super.display();
        System.out.println("Email " + this.email);
        System.out.println("RollNumber " + this.rollNumber);
    }

}
