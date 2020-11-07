package com.mycompany.privateschool;

import java.util.ArrayList;
import java.util.Date;

public class InitializeListsManual {

    private static ArrayList<Student> arr = new ArrayList<Student>();

    InitializeListsManual() {
    }

    public static void intializeLists() {
        //Initialize Students
        Person p1 = new Person("Klemens", "Habgood");
        Person p2 = new Person("Rina", "Vasilchenko");
        Person p3 = new Person("Tabina", "Steinhammer");
        Person p4 = new Person("Johanna", "Stanislaw");

        Date d1 = new Date(ConvertDateToLong.convertDate("05/12/1994"));
        Date d2 = new Date(ConvertDateToLong.convertDate("06/06/1994"));
        Date d3 = new Date(ConvertDateToLong.convertDate("20/08/1992"));
        Date d4 = new Date(ConvertDateToLong.convertDate("27/03/1994"));

        Student s1 = new Student(p1, d1, 5000);
        
        Student s2 = new Student(p2, d2, 5000);
        Student s3 = new Student(p3, d3, 5000);
        Student s4 = new Student(p4, d4, 5000);

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
    }

    public static void showStudents() {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }

}