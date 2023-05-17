package com.class1;

import com.class1.controller.CustomerController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerController controller = new CustomerController();
        int choose = 0;
        Scanner input = new Scanner(System.in);


        try {
            do {
                System.out.println("""
                        1. Add new Customer
                        2. view all Customer
                        3. Get Customer by ID
                        4. Update Customer by ID
                        5. Delete Customer by ID
                        6. Exit
                        """);
                choose = input.nextInt();

                switch (choose) {
                    case 1 -> {
                        Customer customer = new Customer();
                        customer.inputData();
                        controller.addNewCustomer(customer);

                    }

                    case 2 -> {
                        controller.getAllCustomers();


                    }
                    case 3 -> {
                        System.out.println("Enter id: ");
                        int id = input.nextInt();

                        Customer customer = controller.getCustomerById(id);
                        if (customer != null) {
                            System.out.println(customer.toString());
                        } else {
                            System.out.println("Not found");
                        }
                    }
                    case 4 -> {
                        System.out.println("Enter Customer id to update: ");
                        int id = input.nextInt();

                        controller.updateCustomer(id);
                    }
                    case 5 -> {
                        System.out.println("Enter Customer id to delete: ");
                        int id = input.nextInt();
                        controller.deleteCustomer(id);
                    }
                    case 6 -> {
                        System.exit(0);
                    }
                }
            }while (true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
