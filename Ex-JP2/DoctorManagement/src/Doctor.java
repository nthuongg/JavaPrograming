import java.util.Scanner;

public class Doctor {
    String name;
    String code;
    String specialization;
    int  availability;

    public Doctor(String code, String name, String specialization, int availability) {
        this.name = name;
        this.code = code;
        this.specialization = specialization;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getAvailability() {
        return availability;
    }

}
