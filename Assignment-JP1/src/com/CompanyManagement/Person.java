package com.CompanyManagement;

import java.util.Scanner;

public abstract class Person {
    private static int count = 0;
    int id;
    String name;
    double salary;

    public Person() {
        this.id = ++count;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    public abstract double getBonus();

    public double getTotalSalary(){
        return getBonus() + salary;
    }
    public abstract void input();
    public abstract void display();
    public abstract void updatePerson();

    public void updateSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cap nhat luong moi: ");
        salary = Double.parseDouble(scanner.nextLine());
        System.out.printf("Da cap nhat luong co ban moi: $%.3f %n", salary);
    }

}

class Director extends Person {
    private String role;

    @Override
    public double getBonus() {
        return 5 * salary;
    }

    public String getRole() {
        return role;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Khoi tao giam doc");
        System.out.print("Nhap ten: ");
        name = scanner.nextLine();
        System.out.print("Nhap luong co ban: $");
        salary = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhap chuc vu: ");
        role = scanner.nextLine();
        System.out.println("Da tao thanh cong");
        display();
    }

    @Override
    public void display() {
        System.out.printf("Giam doc [id = %d, ten = %s, chuc vu = %s, luong co ban = $%.3f, muc thuong = $%.3f, tong luong = $%.3f ]%n", getId(), getName(), role, getSalary(), getBonus(), getTotalSalary());
    }

    @Override
    public void updatePerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cap nhat ten: ");
        name = scanner.nextLine();
        System.out.println("Cap nhat chuc vu: ");
        role = scanner.nextLine();
        System.out.println("Cap nhat thanh cong.");
        display();
    }
}

class Manager extends Person {
    private String department;

    public String setDepartment() {
        return department;
    }

    @Override
    public double getBonus() {
        return 3 * salary;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dang khoi tao truong phong");
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap luong co ban: $");
        salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap phong ban: ");
        department = scanner.nextLine();
        System.out.println("Da tao thanh cong.");
    }

    @Override
    public void display() {
        System.out.printf("Truong phong [ id = %d, ten = %s, phong ban = %s, luong co ban = $%.3f, muc thuong = $%.3f, tong luong = $%.3f ]%n", getId(), getName(), department, getSalary(), getBonus(), getTotalSalary());
    }

    @Override
    public void updatePerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cap nhat ten: ");
        name = scanner.nextLine();
        System.out.print("Cap nhat phong ban: ");
        department = scanner.nextLine();
        System.out.print("Da cap nhat thanh cong.");
        display();
    }
}

class Employee extends Person {
    private String skill;

    public String getSkill() {
        return skill;
    }

    @Override
    public double getBonus() {
        return 3 * salary;
    }

    @Override
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dang khoi tao nhan vien");
        System.out.println("Nhap ten: ");
        name = scanner.nextLine();
        System.out.println("Nhap luong co ban: $");
        salary = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vi tri: ");
        skill = scanner.nextLine();
        System.out.println("Da tao thanh cong.");
    }

    @Override
    public void display() {
        System.out.printf("Truong phong [ id = %d, ten = %s, skill = %s, luong co ban = $%.3f, muc thuong = $%.3f, tong luong = $%.3f ]%n", getId(), getName(), skill, getSalary(), getBonus(), getTotalSalary());
    }

    @Override
    public void updatePerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cap nhat ten: ");
        name = scanner.nextLine();
        System.out.print("Cap nhat skill: ");
        skill = scanner.nextLine();
        System.out.print("Da cap nhat thanh cong.");
        display();
    }
}