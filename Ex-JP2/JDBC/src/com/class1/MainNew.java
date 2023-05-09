package com.class1;

import java.util.ArrayList;
import java.util.List;

public class MainNew {
    public static void main(String[] args) {
        Customer c1 = new Customer(1, "Nguyen Thi Huong", "Ha Noi", "Viet Name", "7418529632", "Huong@gmail.com");
        Customer c2 = new Customer(2, "Nguyen Thi Huong", "Ha Noi", "Viet Name", "7418529632", "Huong@gmail.com");
        Customer c3 = new Customer(3, "Nguyen Thi Huong", "Ha Noi", "Viet Name", "7418529632", "Huong@gmail.com");
        Customer c4 = new Customer(4, "Nguyen Thi Huong", "Ha Noi", "Viet Name", "7418529632", "Huong@gmail.com");
        Customer c5 = new Customer(5, "Nguyen Thi Huong", "Ha Noi", "Viet Name", "7418529632", "Huong@gmail.com");
        Customer c6 = new Customer(6, "Nguyen Thi Huong", "Ha Noi", "Viet Name", "7418529632", "Huong@gmail.com");
        Customer c7 = new Customer(7, "Nguyen Thi Huong", "Ha Noi", "Viet Name", "7418529632", "Huong@gmail.com");
        Customer c8 = new Customer(8, "Nguyen Thi Huong", "Ha Noi", "Viet Name", "7418529632", "Huong@gmail.com");
        Customer c9 = new Customer(9, "Nguyen Thi Huong", "Ha Noi", "Viet Name", "7418529632", "Huong@gmail.com");
        Customer c10 = new Customer(10, "Nguyen Thi Huong", "Ha Noi", "Viet Name", "7418529632", "Huong@gmail.com");

        List<Customer> customers = new ArrayList<>();
        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        customers.add(c6);
        customers.add(c7);
        customers.add(c8);
        customers.add(c9);
        customers.add(c10);


        /*
        COPY THIS
         */
        System.out.println("=".repeat(130));
        System.out.printf("| %-10s | %-25s | %-20s | %-20s | %-20s | %-25s\n", "ID", "NAME", "CITY", "COUNTRY", "PHONE", "EMAIL");
        System.out.println("=".repeat(130));
        for (Customer customer : customers) {
            System.out.printf("| %-10s | %-25s | %-20s | %-20s | %-20s | %-25s\n",customer.id, customer.name, customer.city, customer.country, customer.phone, customer.email);
            System.out.println("-".repeat(130));
        }
    }
}
