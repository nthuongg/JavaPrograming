package com.class3.file;

import com.class3.Doctor;

import java.io.*;

public class MainClassFile {
    public static void main(String[] args) {

        int data1 = 5;
        String data2 = "This is programiz";

        Doctor doctor = new Doctor("D01", "Doctor 1", "Spec 1", 3);

        try {
            //Write file

            FileOutputStream fileOutputStream = new FileOutputStream("doctor.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);

            oos.writeObject( doctor );

            oos.close();
            fileOutputStream.close();

            //Read file
            FileInputStream fileInputStream = new FileInputStream("doctor.txt");
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);

            Doctor doctorRead = (Doctor) ois.readObject();
            doctorRead.display();
            //System.out.println("Output: " + str);

            ois.close();
            fileInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
