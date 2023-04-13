package com.day3;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.inputData(); //1000

        int n;
        int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.print("input number of bill: ");
        n = s.nextInt();
        int[] bills = new int[n];
        for(int i = 0 ;i < n; i++)
        {
            System.out.print("input value of bill  " + (i+1) + " ");
            bills[i] = s.nextInt();
        }

        sum = person.calcTotal(bills);
        System.out.println("Sum = " + sum); //600

        if(person.payMoney(sum)) {
            System.out.println("You can buy it");
        } else {
            System.out.println("You can not buy it ");
        }


//        Wallet wallet = new Wallet();
//        wallet.payMoney(sum, person.money);
//        System.out.println("SUM= "+sum);
//        System.out.println("Money= "+person.money);
    }
}
