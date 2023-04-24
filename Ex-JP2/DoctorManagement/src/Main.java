import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true){
            System.out.println("""
                === Doctor management ===
                1. Add Doctor
                2. Update Doctor
                3. Delete Doctor
                4. Search Doctor
                5. Exit
                """);
            System.out.print("Please choice one option: ");
            DoctorHash doctorHash = new DoctorHash();
            Scanner scanner = new Scanner(System.in);
            int selected = Integer.parseInt(scanner.nextLine());

            switch (selected){
                case 1 -> {
                    System.out.println("--------- Add Doctor ----------");
                    System.out.println("Enter Code: ");
                    String code = scanner.nextLine();
                    System.out.println("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter Specialization: ");
                    String specialization = scanner.nextLine();
                    System.out.println("Enter Availability: ");
                    int availability = Integer.parseInt(scanner.nextLine());


                    Doctor doctor = new Doctor(code, name, specialization, availability);
                    try {
                        if (doctorHash.findDoctor(doctor)) {
                            System.out.println("Founded");
                        } else {
                            System.out.println("Not founded");
                        }
                    }catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
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