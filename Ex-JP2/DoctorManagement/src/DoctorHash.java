import java.util.HashMap;

public class DoctorHash {
    HashMap<String, Doctor> map;

    public DoctorHash(){
        map = new HashMap();
    }

    public boolean addDoctor(Doctor doctor) throws Exception {
        if (map == null) {
            throw new IllegalAccessException("Database doesn't exist");
        }
        String key = doctor.getCode();
        if (map.containsKey(key)) {
            throw new IllegalAccessException("Doctor code " + key + " is duplicate");
        }
        if (doctor == null) {
            throw new IllegalAccessException("Data doesn't exist");
        }
        int availability = doctor.getAvailability();
        if (!checkAvailability(availability)){
            throw new IllegalAccessException("Invalid availability. Availability must be >= 0");
        }
        map.put(key,doctor);
        return true;
    }

    public boolean updateDoctor(Doctor doctor) throws Exception {
        if (map == null) {
            throw new IllegalAccessException("Database doesn't exist");
        }

        if (doctor == null) {
            throw new IllegalAccessException("Data doesn't exist");
        }

        String key = doctor.getCode();
        if (!map.containsKey(key)) {
            throw new IllegalAccessException("Doctor code doesn’t exist");
        }

        int availability = doctor.getAvailability();
        if (!checkAvailability(availability)){
            throw new IllegalAccessException("Invalid availability. Availability must be >= 0");
        }

        map.replace(key,doctor);
        return true;
    }
    private boolean  checkAvailability(int availability) {
        return availability >= 0;
    }
}
