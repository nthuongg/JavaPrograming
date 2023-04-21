package com.class8;

public class MainClass {
    public static void main(String[] args) {
        Customer customer = new Customer();

        try {
            customer.inputData();
            //Display

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
