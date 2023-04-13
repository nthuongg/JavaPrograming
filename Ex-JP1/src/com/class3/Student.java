package com.class3;

import java.util.Scanner;

public class Student {
    private String rollNumber;
    private String name;
    private int age;

    private Wallet wallet;

    //constructor
    public Student() {
        this.rollNumber = "";
        this.name = "";
        this.age = 0;
        this.wallet = new Wallet();
    }

    //constructor
    public Student(String rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.wallet = new Wallet();
    }

    public void deposit() {
        System.out.print("Enter money : ");
        Scanner input = new Scanner(System.in);
        int money = input.nextInt();

        this.wallet.depositMoney(money);
    }

    public void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rollnumber ");
        this.rollNumber = input.nextLine();

        System.out.print("Enter name ");
        this.name = input.nextLine();

        System.out.print("Enter age ");
        this.age = input.nextInt();
    }

    public void display() {
        System.out.println("Rollnumber: " + this.rollNumber);
        System.out.println("Name " + this.name);
        System.out.println("Age " + this.age);
    }
}

