package com. WordProgram;

import java.io.File;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        FileManagement management = new FileManagement();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("""
                    ===Word Program===
                    1. Count a word in a file.
                    2. Find files by word.
                    3. Exit.
                    """);
            System.out.println("Enter menu [1-3]");
            String Selected = scanner.nextLine();
            switch (Selected){
                case "1" -> {
                    System.out.println("----- Count a word in a file -----");
                    System.out.println("Enter word: ");
                    String word = scanner.nextLine();
                    System.out.println("Enter file: ");
                    File file = new File(scanner.nextLine());

                    try {
                        int count = management.countWord(file, word);
                        if(count > 0) {
                            System.out.println(word + " found " + count + " times");
                        } else  {
                            System.out.println("Word not found");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                case "2" -> {
                    System.out.println("----- Find files by word -----");
                    System.out.println("Enter folder: ");
                    File directory = new File(scanner.nextLine());
                    System.out.println("Enter word to find: ");
                    String word = scanner.nextLine();

                    try {
                        management.getFile(directory, word);
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }

                case "3" ->{
                    System.exit(0);
                }
            }
        }
    }
}
