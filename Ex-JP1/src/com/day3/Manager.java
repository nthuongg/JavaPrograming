package com.day3;

import java.util.Scanner;

public class Manager extends Staff{
    String department;


    @Override
    public int getBonus() {
        return 3 * this.salary;
    }

    public  void inputData(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        this.name = input.nextLine();

        System.out.print("Enter email: ");
        this.email = input.nextLine();

        System.out.print("Enter salary: $");
        this.salary = input.nextInt();

        input = new Scanner(System.in);
        System.out.print("Enter department ");
        this.department = input.nextLine();
    }

    public void display(){
        System.out.println("This is an Manager");
        System.out.println("name: " + this.name);
        System.out.println("email: " + this.email);
        System.out.println("salary: $" + this.salary);
        System.out.println("department " +this.department);
    }
}
