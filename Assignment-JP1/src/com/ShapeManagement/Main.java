package com.ShapeManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Shape> list = new ArrayList<Shape>();
    public static void main(String[] args) {

        System.out.println("==Chao mung ban den voi ShapeManagement ");
        System.out.println("1. Tao hinh chu nhat");
        System.out.println("2. Sua hinh chu nhat");
        System.out.println("3. Tao hinh tam giac");
        System.out.println("4. Sua hinh tam giac");
        System.out.println("5. Tao hinh tron");
        System.out.println("6. Sua hinh tron");
        System.out.println("7.Tra cuu hinh");
        System.out.println("8.Thoat");

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Vui long chon menu [1 - 8]");
            int selectedMenu = Integer.parseInt(scanner.nextLine());

            switch (selectedMenu){
                case 1 ->runMenu1();
            }
            switch (selectedMenu){
                case 2 ->runMenu2();
            }
            switch (selectedMenu){
                case 3 ->runMenu3();
            }
            switch (selectedMenu){
                case 4 ->runMenu4();
            }
            switch (selectedMenu){
                case 5 ->runMenu5();
            }
            switch (selectedMenu){
                case 6 ->runMenu6();
            }
            switch (selectedMenu){
                case 7 ->runMenu7();
            }
            switch (selectedMenu){
                case 8 -> System.exit(0);
            }


        }
    }


    public static void runMenu1() {
        Rectangle rectangle = new Rectangle();
        rectangle.inputData();
        list.add(rectangle);
        System.out.println(rectangle.toString());
    }
    public static void runMenu2() {
        Rectangle rectangle = new Rectangle();
        rectangle.inputData();
        list.add(rectangle);
        System.out.println(rectangle.toString());
    }
    public static void runMenu3() {
        Triangle triangle = new Triangle();
        triangle.inputData();
        list.add(triangle);
        System.out.println(triangle.toString());
    }
    public static void runMenu4() {
        Triangle triangle = new Triangle();
        triangle.inputData();
        list.add(triangle);
        System.out.println(triangle.toString());
    }
    public static void runMenu5() {
        Circle circle = new Circle();
        circle.inputData();
        list.add(circle);
        System.out.println(circle.toString());
    }
    public static void runMenu6() {
        Circle circle = new Circle();
        circle.inputData();
        list.add(circle);
        System.out.println(circle.toString());
    }

    public static void runMenu7() {
        System.out.println("Vui long nhap id hinh can tim: ");
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        findShape(id);

    }
    public static Shape findShape(int id){
        for (Shape item: list){
            if(item.getId() == id){
                System.out.println("Tim thay mot ket qua: " + item);
                return item;
            }
        }
        System.out.println("Khong tim thay ket qua nao.");
        return null;
    }
}
