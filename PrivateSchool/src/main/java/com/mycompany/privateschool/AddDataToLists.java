package com.mycompany.privateschool;

import java.util.ArrayList;
import java.util.Scanner;

public class AddDataToLists {

    private static ArrayList<Student> arrStudent = new ArrayList<Student>();
    private static ArrayList<Trainer> arrTrainer = new ArrayList<Trainer>();
    private static ArrayList<Course> arrCourse = new ArrayList<Course>();
    private static ArrayList<Assignment> arrAssignment = new ArrayList<Assignment>();

    AddDataToLists() {

    }

    public static ArrayList<Student> getArrStudent() {
        return arrStudent;
    }

    public static ArrayList<Trainer> getArrTrainer() {
        return arrTrainer;
    }

    public static ArrayList<Course> getArrCourse() {
        return arrCourse;
    }

    public static void intializeLists() {
        //Initialize Students
        Person p1 = new Person("Klemens", "Habgood");
        Person p2 = new Person("Rina", "Vasilchenko");
        Person p3 = new Person("Tabina", "Steinhammer");
        Person p4 = new Person("Johanna", "Stanislaw");

        Student s1 = new Student(p1,
                ConvertDateLong.convertDate("05/12/1994"), 5000);
        Student s2 = new Student(p2,
                ConvertDateLong.convertDate("06/06/1994"), 5000);
        Student s3 = new Student(p3,
                ConvertDateLong.convertDate("20/08/1992"), 5000);
        Student s4 = new Student(p4,
                ConvertDateLong.convertDate("27/03/1994"), 5000);

        arrStudent.add(s1);
        arrStudent.add(s2);
        arrStudent.add(s3);
        arrStudent.add(s4);

        //Initialize Courses
        TitleName cb3 = new TitleName("CB3");
        TitleName cb2 = new TitleName("CB2");
        TitleName cb1 = new TitleName("CB1");
        TitleName cb4 = new TitleName("CB4");

        long fullTimeStartDate = ConvertDateLong.convertDate("01/04/2021");
        long fullTimeEndDate = ConvertDateLong.convertDate("31/05/2021");
        long partTimeStartDate = ConvertDateLong.convertDate("01/03/2021");
        long partTimeEndDate = ConvertDateLong.convertDate("31/05/2021");

        Course c1 = new Course(cb3, "Mathematics", "FullTime",
                fullTimeStartDate, fullTimeEndDate);
        Course c2 = new Course(cb3, "Mathematics", "PartTime",
                partTimeStartDate, partTimeEndDate);
        Course c3 = new Course(cb2, "Programming", "FullTime",
                partTimeStartDate, partTimeEndDate);
        Course c4 = new Course(cb2, "Programming", "PartTime",
                partTimeStartDate, partTimeEndDate);
        Course c5 = new Course(cb1, "Networking", "FullTime",
                partTimeStartDate, partTimeEndDate);
        Course c6 = new Course(cb1, "Networking", "PartTime",
                partTimeStartDate, partTimeEndDate);
        Course c7 = new Course(cb4, "DataBase", "FulltimeTime",
                partTimeStartDate, partTimeEndDate);
        Course c8 = new Course(cb4, "DataBase", "PartTime",
                partTimeStartDate, partTimeEndDate);

        arrCourse.add(c1);
        arrCourse.add(c2);
        arrCourse.add(c3);
        arrCourse.add(c4);
        arrCourse.add(c5);
        arrCourse.add(c6);
        arrCourse.add(c7);
        arrCourse.add(c8);

        //Initialize Trainer
        Person p5 = new Person("Corissa", "Abrahim");
        Person p6 = new Person("Judith", "Howatt");
        Person p7 = new Person("Merry", "Kenewell");

        Trainer t1 = new Trainer(p5, "Programming");
        Trainer t2 = new Trainer(p6, "Networking");
        Trainer t3 = new Trainer(p7, "Database");

        arrTrainer.add(t1);
        arrTrainer.add(t2);
        arrTrainer.add(t3);

        //Initialize Assignment
        TitleName title1 = new TitleName("Assignment1");
        TitleName title2 = new TitleName("Assignment2");
        TitleName title3 = new TitleName("Assignment3");
        TitleName title4 = new TitleName("Assignment4");

        Assignment a1 = new Assignment(title1, "Create an Assignment1",
                ConvertDateLong.convertDate("08/04/2021"));
        Assignment a2 = new Assignment(title2, "Create an Assignment2",
                ConvertDateLong.convertDate("08/04/2021"));
        Assignment a3 = new Assignment(title3, "Create an Assignment3",
                ConvertDateLong.convertDate("08/04/2021"));
        Assignment a4 = new Assignment(title4, "Create an Assignment4",
                ConvertDateLong.convertDate("08/04/2021"));
        arrAssignment.add(a1);
        arrAssignment.add(a2);
        arrAssignment.add(a3);
        arrAssignment.add(a4);
    }

    public static void showStudents() {
        for (int i = 0; i < arrStudent.size(); i++) {
            System.out.println(arrStudent.get(i));
        }
    }

    public static void manualAddStudentsLists(Student s) {
        arrStudent.add(s);
    }

    public static void manualAddCourseList(Course c) {
        arrCourse.add(c);
    }

    public static void manualAddTrainer(Trainer t) {
        arrTrainer.add(t);
    }

    public static void manualAddAssignment(Assignment a) {
        arrAssignment.add(a);
    }

}
