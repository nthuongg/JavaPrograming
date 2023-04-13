package com.Asm7;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {


         DataManagement management = new DataManagement();

        String email = "nguyengmail.com";
        try {
            String result = management.checkEmail(email);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }}