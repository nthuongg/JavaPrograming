import java.util.HashMap;

public class DoctorHash {
    private HashMap<String, Doctor> map;

    public DoctorHash() {
        map = new HashMap<>();
    }

    public boolean addDoctor(Doctor doctor) throws Exception {
        if (map == null) {
            throw new Exception("Database doesn't exist");
        }
        if (doctor == null) {
            throw new Exception("Data doesn't exist");
        }
        String key = doctor.getCode();
        System.out.println("Code = " + key);
        if (map.containsKey(key)) {
            System.out.println("duplicated");
            throw new Exception("Doctor code " + key + " is duplicate");
        }
        int availability = doctor.getAvailability();
        if (!checkAvailability(availability)){
            throw new Exception("Invalid availability. Availability must be >= 0");
        }
        map.put(key,doctor);
        System.out.println(map.entrySet());
        return true;
    }

    public boolean updateDoctor(Doctor doctor) throws Exception {
        if (map == null) {
            throw new Exception("Database doesn't exist");
        }

        if (doctor == null) {
            throw new Exception("Data doesn't exist");
        }

        String key = doctor.getCode();
        if (!map.containsKey(key)) {
            throw new Exception("Doctor code doesn’t exist");
        }

        int availability = doctor.getAvailability();
        if (!checkAvailability(availability)){
            throw new Exception("Invalid availability. Availability must be >= 0");
        }

        map.replace(key,doctor);
        return true;
    }

    public boolean findDoctor(Doctor doctor) {
        if (map.containsKey(doctor.getCode())) {
            return true;
        }
        return false;
    }

//    public boolean deleteDoctor(Doctor doctor) throws Exception {
//
//    }
    private boolean  checkAvailability(int availability) {
        return availability >= 0;
    }
}
