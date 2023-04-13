package com.day3;

public class MainClassNew {
    public static void main(String[] args) {
        //Array of Person
        Person persons[] = new Person[3];

        persons[0] = new Person("Tuan", 21, 1000);
        persons[1] = new Person("Nam", 22, 500);
        persons[2] = new Person("Son", 20, 2000);

        for (int i = 0; i < persons.length; i++) {
            persons[i].display();
        }

        for(Person item : persons) {
            item.display();
        }

        Student newStudent = new Student("Tuan",
                                        21,
                                        1000,
                                        "tuan@gmail.com",
                                        "S001");

        newStudent.display();
    }
}
