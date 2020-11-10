package com.mycompany.privateschool;

import java.util.Scanner;

public class UserInput {
    
    UserInput() {
        
    }
    
    public static void manualStudentsLists() {
        Person p = new Person();
        System.out.println("Please give me students first name.");
        Scanner sc = new Scanner(System.in);
        p.setFirstName(sc.next());
        System.out.println("Please give me students last name.");
        p.setLastName(sc.next());
        System.out.println("Please give me students date of birth.");
        Student s = new Student(p.getFirstName(), p.getLastName());
        s.setDateOfBirth(ConvertDateLong.convertDate(sc.next()));
        System.out.println("Please give me the tuition fees of student.");
        s.setTuitionFees(sc.nextInt());
        AddDataLists.AddStudentsLists(s);
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
        AddDataLists.AddCourseList(c);
    }
    
    public static void manualTrainer() {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        System.out.println("Please give me trainers first name.");
        p.setFirstName(sc.next());
        System.out.println("Please give me trainers last name.");
        p.setLastName(sc.next());
        Trainer t = new Trainer(p.getFirstName(), p.getLastName());
        System.out.println("Please give me what subject the trainer teaches");
        t.setSubject(sc.next());
        AddDataLists.AddTrainer(t);
    }
    
    public static void manualAssignment() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give me the title of assignment");
        TitleName title1 = new TitleName(sc.next());
        Assignment a = new Assignment(title1);
        System.out.println("Please give me a description of assignment");
        a.setDescription(sc.nextLine());
        System.out.println("Please give me a date to assign ");
        a.setSubDateTime(ConvertDateLong.convertDate(sc.next()));
        AddDataLists.AddAssignment(a);
    }
}
