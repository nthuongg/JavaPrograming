package com.class3;

public class Wallet {
    int amount;

    public Wallet() {
        this.amount = 0;
    }

    public boolean payMoney(int money) {
        if(money > this.amount)
            return false;

        this.amount -= money;
        System.out.println("Amount " + this.amount);

        return true;
    }

    public void depositMoney(int money) {
        this.amount += money;
    }
}
