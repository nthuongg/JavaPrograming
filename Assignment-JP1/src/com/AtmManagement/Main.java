package com.AtmManagement;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Account> list = new ArrayList<Account>();

    public static void main(String[] args) {
        System.out.println("===Chao mung ban den voi AtmManagement===");
        System.out.println("1. Tao tai khoan");
        System.out.println("2. Nap tien");
        System.out.println("3. Rut tien");
        System.out.println("4. Tra cuu tai khoan");
        System.out.println("5. Hien thi danh sach tai khoan");
        System.out.println("6. Xoa tai khoan");
        System.out.println("7. Sua tai khoan");
        System.out.println("8. Thoat chuong trinh");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Nhap lua chon cua ban [1 - 8]");
            int selectedMenu = Integer.parseInt(scanner.nextLine());
            switch (selectedMenu) {
                case 1 -> {
                    createNewAccount();
                }
                case 2 -> {
                    deposit();
                }
                case 3 -> {
                    cashWithdrawal();
                }
                case 4 -> {
                    findAccount();
                }
                case 5 -> {
                    showAllAccount();
                }
                case 6 -> {
                    deleteAccount();
                }
                case 7 -> {
                    editAccount();
                }
                case 8 -> {
                    System.exit(0);
                }
            }
        }
    }
    private static void createNewAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tao tai khoan moi");
        System.out.println("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap so dien thoai: ");
        String phone = scanner.nextLine();
        System.out.println("Nhap so CCCD: ");
        String id = scanner.nextLine();
        System.out.println("Nhap so tai khoan: ");
        String accountNumber = scanner.nextLine();
        Account account = new Account(name, phone, id, accountNumber);
        System.out.println("Tao tai khoan thanh cong. Thong tin tai khoan: " + account);
        list.add(account);
    }

    private static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tai khoan can nap: ");
        String accountNumber = scanner.nextLine();
        Account result = findAccountByAccountNumber(accountNumber);
        if (result != null) {
            System.out.println("Nhap so tien ban muon nap: $");
            double amount = Double.parseDouble(scanner.nextLine());
            result.addBalance(amount);
            System.out.printf("Nap thanh cong $%.3f.%n",amount);
            System.out.printf("So du hien tai cua ban la: $%.3f.%n",result.getBalance());
        } else {
            System.out.println("So tai khoan nay khong ton tai.");
        }
    }

    private static void cashWithdrawal() {
        System.out.println("Rut tien tu tai khoan");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tai khoan rut tien: ");
        String accountNumber = scanner.nextLine();
        Account result = findAccountByAccountNumber(accountNumber);
        if (result != null) {
            System.out.println("Nhap so tien ban muon rut: $");
            double amount = Double.parseDouble(scanner.nextLine());
            if (result.verifyWithdrawal(amount)){
                result.withdrawal(amount);
                System.out.printf("Da rut thanh cong $%.3f.%n", amount);
                System.out.printf("So du hien tai cua ban la: $%.3f.%n",result.getBalance());
            } else {
                System.out.println("Ban khong du so du de thuc hien giao dich nay");
            }
        } else {
            System.out.println("So tai khoan nay khong ton tai.");
        }
    }

    private static void findAccount() {
        System.out.println("Tra cuu tai khoan");
        System.out.println("Nhap so CCCD cua STK ban muon tra cuu: ");
        Scanner scanner = new Scanner(System.in);
        String id = scanner.nextLine();
        if (findAccountById(id) != null){
            System.out.println("Tim thay 1 ket qua " + findAccountById(id));
        }else {
            System.out.println("So CCCD nay khong chinh xac");
        }
    }

    private static void showAllAccount() {
        System.out.println("Hien thi danh sach tai khoan");
        for (Account item: list) {
            System.out.println(item);
        }
        System.out.println("Tong so tai khoan: " + list.size());
    }

    private static void deleteAccount() {
        System.out.println("Xoa tai khoan");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tai khoan ban muon xoa: ");
        String accountNumber = scanner.nextLine();
        Account result = findAccountByAccountNumber(accountNumber);
        if (result != null){
            list.remove(result);
            System.out.println("Da xoa");
        } else {
            System.out.println("So tai khoan nay khong ton tai.");
        }
    }

    private static void editAccount() {
        System.out.println("Sua tai khoan");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tai khoan ban muon sua: ");
        String accountNumber = scanner.nextLine();
        Account result = findAccountByAccountNumber(accountNumber);
        if (result != null) {
            System.out.println("Nhap ten: ");
            String name = scanner.nextLine();
            System.out.println("Nhap so dien thoai: ");
            String phone = scanner.nextLine();
            System.out.println("Nhap so CCCD: ");
            String id = scanner.nextLine();
            result.update(id, name, phone);
            System.out.println("Ban da cap nhat thanh cong: " + result);
        } else {
            System.out.println("So tai khoan nay khong ton tai.");
        }
    }
    private static Account findAccountById(String id) {
        for (Account item: list) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    private static Account findAccountByAccountNumber(String accountNumber) {
        for (Account item: list) {
            if (item.getAccountNumber().equals(accountNumber)) {
                return item;
            }
        }
        return null;
    }
}
