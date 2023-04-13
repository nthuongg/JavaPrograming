package com.main3;

import com.bill.Person;

public class MainClassObject {
    public static void main(String[] args) {

        //Person stu = new Person("A12345", "Tuan", 21);
        Person newPerson = new Person("huong", 18);
        newPerson.inputData();
        newPerson.display();

        //deposit money to Student
        newPerson.deposit();
    }
}


