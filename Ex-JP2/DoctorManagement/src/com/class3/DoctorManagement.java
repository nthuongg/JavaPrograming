package com.class3;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DoctorManagement {
    HashMap<String, Doctor> mapDoctors;

    DoctorManagement() {
        mapDoctors = new HashMap<>();
        this.readAllObjectFromFileMap();
    }

    DoctorManagement(HashMap<String, Doctor> map) {
        this.mapDoctors = map;
    }

    public void viewAllDoctors() throws Exception {
        Iterator iter = this.mapDoctors.entrySet().iterator();

        while(iter.hasNext()) {
            Map.Entry<String, Doctor> entry
                    = (Map.Entry<String, Doctor>) iter.next();
            entry.getValue().display();
        }
    }

    public Doctor findDoctorByKey(String code) {
        if( this.mapDoctors.containsKey(code) ) {
            return this.mapDoctors.get(code);
        }
        return null;
    }

    public boolean updateDoctor(Doctor doctor) throws Exception {
        // Write code here

        this.mapDoctors.put(doctor.getCode(), doctor);
        return true;
    }

    public void readAllObjectFromFileMap() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("doctor.map");
            ois = new ObjectInputStream(fis);

            this.mapDoctors = (HashMap<String, Doctor>) ois.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(ois != null )
                    ois.close();
                if(fis != null)
                    fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void writeAllObject2FileMap() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("doctor.map", true);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(this.mapDoctors);

            objectOutputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public boolean addDoctor(Doctor doctor) throws Exception {
        // Write code here
        if(this.mapDoctors.containsKey(doctor.getCode())) {
            throw new Exception("Doctor existing");
        }
        this.mapDoctors.put(doctor.getCode(), doctor);
        //Write to file
        //this.writeDoctor2File( doctor );

        return true;
    }

    private void readDoctorsFromFile() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("doctor1.dat");
            ois = new ObjectInputStream(fis);

            for (int i = 0; i < 2; i++) {
                Doctor d = (Doctor) ois.readObject();
                this.mapDoctors.put(d.getCode(), d);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if(ois != null )
                    ois.close();
                if(fis != null)
                    fis.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void writeDoctor2File(Doctor doctor) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("doctor1.dat", true);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(doctor);

            objectOutputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public HashMap<String, Doctor> searchDoctor(String input)
            throws Exception {

        HashMap<String, Doctor> result = new HashMap<>();

        if(input == null || input.equals("")) {
            throw new Exception("Keyword to find can not be empty");
        } else {
            for(Doctor item : this.mapDoctors.values()) {
                if(item.getCode().contains(input)) {
                    result.put(item.getCode(), item);
                    System.out.println("Found code");
                } else if(item.getName().contains(input)) {
                    result.put(item.getCode(), item);
                    System.out.println("Found name");
                } else if(item.getSpecialization().contains(input)) {
                    result.put(item.getCode(), item);
                    System.out.println("Found spec");
                }
            }
        }

        return result;
    }

}
