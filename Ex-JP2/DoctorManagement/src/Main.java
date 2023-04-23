import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("""
                === Doctor management ===
                1. Add Doctor
                2. Update Doctor
                3. Delete Doctor
                4. Search Doctor
                5. Exit
                """);
        Scanner scanner = new Scanner(System.in);
        int selected = scanner.nextInt();
        while (true){
            switch (selected){
                case 1 -> {
                    System.out.println("--------- Add Doctor ----------");
                    System.out.println("Enter Code: ");
                    String code = scanner.nextLine();
                    System.out.println("Enter Name ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Specialization: ");
                    String specialization = scanner.nextLine();
                    System.out.println("Enter Availability: ");
                    int availability = scanner.nextInt();
                    System.out.println("Doctor added successfully!");

                    Doctor doctor = new Doctor(code, name, specialization, availability);

                }

                case 2 -> {
                    System.out.println("--------- Update Doctor -------");
                    System.out.println("Enter Code: ");
                    String code = scanner.nextLine();
                    System.out.println("Enter Name ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Specialization: ");
                    String specialization = scanner.nextLine();
                    System.out.println("Enter Availability: ");
                    String availability = scanner.nextLine();
                }
                case 3 -> {
                    System.out.println("--------- Delete Doctor -------");
                    System.out.println("Enter Code: ");
                    String code = scanner.nextLine();

                }
            }
        }

    }

}