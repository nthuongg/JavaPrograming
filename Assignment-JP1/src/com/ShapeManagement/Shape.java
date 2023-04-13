package com.ShapeManagement;

import java.util.Scanner;

public abstract class Shape {

    private int id;
    public int getId() {
        return id;
    }

    public void inputData(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap id hinh: ");
        id = Integer.parseInt(scanner.nextLine());
    }

    public abstract void edit();

    public abstract String toString();
}

class Rectangle extends Shape {
    int length;
    int width;

    private int id;



    @Override
    public String toString() {
        return String.format("Hinh chu nhat [chieu dai = %d, chieu rong = %d]%n", length, width);
    }

    @Override
    public void inputData(){
        super.inputData();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length: ");
        length = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter width: ");
        width = Integer.parseInt(scanner.nextLine());

    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length: ");
        length = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter width: ");
        width = Integer.parseInt(scanner.nextLine());
    }
}
class Triangle extends Shape {
    int a;
    int b;
    int c;
    private int id;

    @Override
    public String toString() {

        return String.format("Hinh tam giac [a = %d, b = %d, c = %d]%n", a, b, c);
    }

    @Override
    public void inputData() {
        super.inputData();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        a = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter b: ");
        b = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter c: ");
        c = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        a = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter b: ");
        b = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter c: ");
        c = Integer.parseInt(scanner.nextLine());
    }

}
class Circle extends Shape {
    int r;
    private int id;

    @Override
    public String toString() {
        return String.format("Hinh tron [ban kinh = %d]%n", r);
    }

    @Override
    public void inputData() {

        super.inputData();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        r = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        r = Integer.parseInt(scanner.nextLine());
    }
}