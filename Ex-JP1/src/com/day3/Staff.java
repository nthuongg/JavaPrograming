package com.day3;

import java.util.Scanner;

public abstract class Staff {
    String name;
     String email;
     int salary;

    //set Salary
    public void setSalary(int sal) {
        this.salary = sal;
    }

    public abstract void inputData();

    public abstract void display();

    public void getSalary(int sal){
        this.salary = sal;
    }
    public abstract int getBonus();
}

