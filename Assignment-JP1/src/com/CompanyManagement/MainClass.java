package com.CompanyManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainClass {
    private static List<Person> list = new ArrayList<Person>();

    private static Person person;
    public static void main(String[] args) {
        System.out.println("Chao mung den voi StaffManagement");
        System.out.println("1. Tao nhan su moi");
        System.out.println("2. Hien thi tat ca nhan su");
        System.out.println("3. Tim kiem nhan su theo ID");
        System.out.println("4. Cap nhat nhan su");
        System.out.println("5. Tong tien thuong cua cong ty");
        System.out.println("6. Cap nhat luong cho nhan su");
        System.out.println("7. Thoat");

        Scanner scanner = new Scanner(System.in);
    while (true){
        System.out.println("Nhap lua chon cua ban");
        int selectedMenu = Integer.parseInt(scanner.nextLine());
        switch (selectedMenu) {
            case 1 -> {
                createNewPerson();
            }
            case 2 -> {
                displayAllPeople();
            }
            case 3 -> {
                findPerson();
            }
            case 4 -> {
                updatePerson();
            }
            case 5 -> {
                getTotalBonusOfCompany();
            }
            case 6 -> {
                updateSalary();
            }
            case 7 -> {
                System.exit(0);
            }
        }
    }





//        for(Staff item : staff) {
//            item.inputData();
//        }
//
//        int total = 0;
//        for (Staff item : staff) {
//            item.display();
//            System.out.println("Bonus " + item.getBonus());
//            total += item.getBonus();
//        }
//
//        System.out.println("Company bonus: " + total);
    }
    private static void createNewPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Ban muon tao nhan su nao [1 - 3]");
        System.out.println("1. Giam doc");
        System.out.println("2. Truong phong");
        System.out.println("3. Nhan vien");
        while (true){
            System.out.println("Nhap lua chon cua ban");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1 -> {
                    person = new Director();
                }
                case 2 -> {
                    person = new Manager();
                }
                case 3 -> {
                    person = new Employee();
                }
            }
            person.input();
            list.add(person);
            break;
        }
    }

    private static void displayAllPeople() {
        System.out.println("Cong ty hien co " + list.size() + " nhan su.");
        for (Person person : list) {
            person.display();
        }
    }

    private static void findPerson() {
        System.out.println("Nhap Id cua nhan vien can tim: ");
        Scanner scanner = new Scanner(System.in);
        int id = Integer.parseInt(scanner.nextLine());
        findPeronById(id);
        if (findPeronById(id) != null) {
            System.out.println("Tim thay 1 ket qua ");
            findPeronById(id).display();
        }else {
            System.out.println("Khong tim thay ket qua nao");
        }
    }

    private static Person findPeronById(int id) {
        for (Person person : list) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    private static void updatePerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Id nhan su ban muon cap nhat: ");
        int id = Integer.parseInt(scanner.nextLine());
        Person result = findPeronById(id);
        if (result != null) {
            System.out.println("Tim thay 1 ket qua");
            result.display();
            result.updatePerson();
        }else {
            System.out.println("Khong tim thay ket qua nao");
        }
    }

    private static void getTotalBonusOfCompany() {
        int total = 0;
        for (Person person : list) {
            person.display();
            System.out.println("Bonus " + person.getBonus());
            total += person.getBonus();
        }

        System.out.println("Total Bonus Of Company: " + total);

    }

    private static void updateSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Nhap Id cua nhan su can cap nhat luong: ");
        int id = Integer.parseInt(scanner.nextLine());
        Person result = findPeronById(id);
        if (result != null) {
            System.out.println("Tim thay 1 ket qua");
            result.display();
            result.updateSalary();
        }else {
            System.out.println("Khong tim thay ket qua nao");
        }
    }
}
