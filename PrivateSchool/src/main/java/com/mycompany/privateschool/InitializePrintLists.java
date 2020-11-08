package com.mycompany.privateschool;

import java.util.ArrayList;
import java.util.Scanner;

public class InitializePrintLists {

    private static ArrayList<Student> arrStudent = new ArrayList<Student>();
    private static ArrayList<Trainer> arrTrainer = new ArrayList<Trainer>();
    private static ArrayList<Course> arrCourse = new ArrayList<Course>();

    InitializePrintLists() {

    }

    public static ArrayList<Student> getArrStudent() {
        return arrStudent;
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

    }

    public static void showStudents() {
        for (int i = 0; i < arrStudent.size(); i++) {
            System.out.println(arrStudent.get(i));
        }
    }

    public static void showCourses() {
        for (int i = 0; i < arrCourse.size(); i++) {
            System.out.println(arrCourse.get(i));
        }
    }

    public static void showTrainer() {
        for (int i = 0; i < arrTrainer.size(); i++) {
            System.out.println(arrTrainer.get(i));
        }
    }

    public static void manualStudentsLists() {
        Person p = new Person();
        System.out.println("Please give me students first name.");
        Scanner sc = new Scanner(System.in);
        p.setFirstName(sc.next());
        System.out.println("Please give me students last name.");
        p.setLastName(sc.next());
        System.out.println("Please give me students date of birth.");
        Student s = new Student(p);
        s.setDateOfBirth(ConvertDateLong.convertDate(sc.next()));
//        Course c1 = new Course();
//        Course c2 = new Course();
//        Course[] courses = {c1 , c2};
//        Student s = new Student(p, courses);
        System.out.println("Please give me the tuition fees of student.");
        s.setTuitionFees(sc.nextInt());
        arrStudent.add(s);
    }

    public static void manualCourseList() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please give the title of course.");
        TitleName t1 = new TitleName(sc.next());
        Course c = new Course(t1);
        System.out.println("Please give the name of course");
        c.setStream(sc.next());
        System.out.println("Please give me if it is FullTime or PartTime");
        c.setType(sc.next());
        System.out.println("Please give me the start date of the course");
        c.setStartDate(ConvertDateLong.convertDate(sc.next()));
        System.out.println("Please give me the ending date of the course");
        c.setEndDate(ConvertDateLong.convertDate(sc.next()));
        arrCourse.add(c);
    }

    public static void manualTrainer() {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        System.out.println("Please give me trainers first name.");
        p.setFirstName(sc.next());
        System.out.println("Please give me trainers last name.");
        p.setLastName(sc.next());
        Trainer t = new Trainer(p);
        System.out.println("Please give me what subject the trainer teaches");
        t.setSubject(sc.next());
        
        arrTrainer.add(t);
    }

}
