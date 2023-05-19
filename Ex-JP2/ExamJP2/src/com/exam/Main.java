package com.exam;

import com.exam.controller.ContactController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactController controller = new ContactController();
        int choose = 0;
        Scanner scanner = new Scanner(System.in);

        try {
            do {
                System.out.println("""
                        1. Add new contact
                        2. Find a contact by name
                        3. Display contacts
                        4. Exit
                        """);
                choose = scanner.nextInt();

                switch (choose) {
                    case 1 -> {
                        Contact contact = new Contact();
                        contact.inputData();
                        controller.addNewContact(contact);

                    }

                    case 2 -> {
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter the name to search: ");
                        String findName = scanner.nextLine();
                        controller.findContactByName(findName);
                    }

                    case 3 -> {
                        controller.displayContacts();
                    }

                    case 4 -> {
                        System.exit(0);
                    }
                }

            } while (true);
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}