package com.bill;
import com.class3.Wallet;

import java.util.Scanner;

public class Person {
    private String name;
    private int tell;
    private Wallet wallet;

    public Person(String name, int tell) {
        this.name = name;
        this.tell = tell;
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

        System.out.print("Enter name ");
        this.name = input.nextLine();

        System.out.print("Enter age ");
        this.tell = input.nextInt();
    }

    public void display() {
        System.out.println("Name " + this.name);
        System.out.println("tell " + this.tell);
    }
}


