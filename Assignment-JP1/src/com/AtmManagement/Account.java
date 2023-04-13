package com.AtmManagement;

public class Account {
    private String id;
    private String name;
    private String accountNumber;
    private String phone;
    private double balance;

    public Account( String name, String phone, String id,String accountNumber){
        this.name = name;
        this.phone = phone;
        this.id = id;
        this.accountNumber = accountNumber;
        balance = 0.0;
    }


    @Override
    public String toString() {
        return "[ " +
                "so CCCD= " + id +
                ", name= " + name +
                ", accountNumber= " + accountNumber +
                ", phone= " + phone +
                ", balance= " + balance +
                " ]";
    }


    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getPhone() {
        return phone;
    }

    public void addBalance(double amount){
        balance += amount;
    }
    public double getBalance() {
        return balance;
    }

    public boolean verifyWithdrawal(double amount) {
        if (balance >= amount) {
            return true;
        }
        return false;
    }

    public void withdrawal(double amount) {
        if (verifyWithdrawal(amount)) {
            balance -= amount;
        }
    }

    public void update(String id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }
}
