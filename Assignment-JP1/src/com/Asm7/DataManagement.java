package com.Asm7;

import java.text.SimpleDateFormat;
        import java.util.Date;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

public class DataManagement {

    public String checkDateTime(String date) throws Exception {
        if(date.equals("")) {
            throw new Exception("Datetime can not be empty");
        }

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = null;
        try {
            d = sdf.parse(date);
        } catch(Exception e) {
            throw new Exception(e.getMessage());
        }

        return d.toString();
    }

    public String checkPhone(String phone) throws Exception {
        if(phone.equals("")) {
            throw new Exception("Phone can not be empty");
        }

        String regex = "\\d{10}";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(phone);
        if(matcher.matches()) {
            System.out.println("Phone OK");
        } else {
            throw new Exception("Phone must is correct format");
        }

        return phone;
    }

    public String checkEmail(String email) throws Exception {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);

        if(email.equals("")) {
            throw new Exception("Email can not be empty");
        }

        Matcher matcher = pattern.matcher(email);
        if(matcher.matches()) {
            System.out.println("Email OK");
        } else {
            throw new Exception("Email must is correct format");
        }

        return email;
    }

}