import java.util.HashMap;
import java.util.Scanner;

public class Management {
    HashMap<String, Doctor> map;

    public Management(){
        map = new HashMap();
    }

    public boolean addDoctor(Doctor doctor) throws Exception {
        if (map == null) {
            throw new Exception("Database doesn't exist");
        }
        String key = doctor.code;
        if (map.containsKey(key)) {
            throw new Exception("Doctor code " + key + " is duplicate");
        }
        if (doctor == null) {
            throw new Exception("Data doesn't exist");
        }
        map.put(key,doctor);
        return true;
    }
}
