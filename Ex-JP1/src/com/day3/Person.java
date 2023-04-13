package com.day3;
import java.util.Scanner;
public class Person {

    public Wallet wallet;
    protected String name;
    int age;
    private String key; //can not be extended

    //Default Constructor
    Person() {
        this.wallet = new Wallet();
        this.name = "";
        this.age = 0;
    }

    Person(String name, int age, int money) {
        this.wallet = new Wallet(money);
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name " + this.name);
        System.out.println("Age " + this.age);
        System.out.println("Ammout " + this.wallet.getMoney());
    }


   public void inputData() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter your money ");

       int money = scanner.nextInt();
       this.wallet.deposit( money );
       System.out.println("Deposit $" + money);
   }

    public int calcTotal (int[] bills)
    {
        int sum = 0;
        for (int i = 0; i < bills.length; i++) {
            sum += bills[i];
        }
        return sum;
    }

    public boolean payMoney(int total) { //600
       return this.wallet.payMoney(total);
    }

}
