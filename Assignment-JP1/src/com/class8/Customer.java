package com.class8;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {
    String customerCode;
    String accountNumber;
    String email;
    int ammout;

    public Customer(String customerCode, String accountNumber, String email, int ammout) {
        this.customerCode = customerCode;
        this.accountNumber = accountNumber;
        this.email = email;
        this.ammout = ammout;
    }

    public Customer() {
        customerCode = "";
        accountNumber = "";
        email = "";
        ammout = 0;
    }

    public String toString() {
        return this.customerCode + ", " + this.accountNumber +", " + this.email;
    }

    public void inputData() throws Exception {
        Scanner input = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\d{6}");

        try  {
            System.out.print("Enter customer code: ");
            String code = input.nextLine();

            if(code.length() != 5) {
                throw new Exception("Code must be charaters");
            }
            this.customerCode = code;

            System.out.print("Enter account number: ");
            String accNumber = input.nextLine();

            if(!accNumber.startsWith("100")) {
                throw new Exception("Account number must be start with 100");
            }

            Matcher matcher = pattern.matcher(accNumber);
            if(!matcher.matches()) {
                throw new Exception("Account number must be 6 digits");
            }

            //Check email

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
