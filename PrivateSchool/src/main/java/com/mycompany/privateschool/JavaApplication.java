package com.mycompany.privateschool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class JavaApplication {

    public static void main(String[] args) {
        Person p1 = new Person("Kwnstantinos", "Kousounnis");
        long x = 1604763268;
        Date dNow = new Date(1220227200);
        System.out.println(dNow);
        Student s1 = new Student(p1, dNow, 120);
        ArrayList<Student> arr = new ArrayList<Student>();
        //arr.add(s1);
    }
}
