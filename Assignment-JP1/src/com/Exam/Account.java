package Exam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    private String customerCode;
    private String customerName;
    private int accNumber;
    private long amount;
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer code");
        while (true) {
            String customerCode = scanner.nextLine();
            if (customerCode.length() == 5) {
                this.customerCode = customerCode;
                break;
            } else {
                System.out.println("Customer code must be 5 characters long.");
            }
        }
        System.out.println("Enter customer name");
        customerName = scanner.nextLine();
        System.out.println("Enter acc number (positive number with 6 digits and starts with ‘100’)");
        while (true) {
            String accNumStr = scanner.nextLine();
            try {
                int accNumber = Integer.parseInt(accNumStr);
                Pattern pattern = Pattern.compile("[0-9]+");
                Matcher matcher = pattern.matcher(accNumStr);
                if (!matcher.matches()) {
                    System.out.println("accNumber must be a number");
                    continue;
                }
                if (accNumStr.length() == 6 && accNumStr.startsWith("100")) {
                    this.accNumber = accNumber;
                    break;
                } else {
                    System.out.println("Please enter 6 digits starting with 100: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number: ");
            }
        }
        this.amount = 0;
    }
    public void depositAndWithdraw(long money, int type) throws Exception{
        if (type == 0) {
            if (money < 0) {
                throw new Exception("The amount of money must be a positive number");
            }
            this.amount += money;
        }
        if (type == 1) {
            if (money > 0 && money < this.amount) {
                this.amount -= money;
                System.out.println("Successful withdrawal.");
            } else {
                System.out.println("Non- sufficient funds.");
            }
        }
    }

    @Override
    public String toString() {
        return "Account[" +
                "customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                ", accNumber=" + accNumber +
                ", amount=" + amount +
                ']';
    }

}
