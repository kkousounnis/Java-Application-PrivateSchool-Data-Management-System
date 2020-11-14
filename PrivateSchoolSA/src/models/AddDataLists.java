package models;

import models.*;
import java.util.ArrayList;
import java.util.Scanner;

public class AddDataLists {

    private static ArrayList<Student> arrStudent = new ArrayList<Student>();
    private static ArrayList<Trainer> arrTrainer = new ArrayList<Trainer>();
    private static ArrayList<Course> arrCourse = new ArrayList<Course>();
    private static ArrayList<Assignment> arrAssignment = new ArrayList<Assignment>();

    AddDataLists() {

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

    public static void AddStudentsLists(Student s) {
        arrStudent.add(s);
    }

    public static void AddCourseList(Course c) {
        arrCourse.add(c);
    }

    public static void AddTrainer(Trainer t) {
        arrTrainer.add(t);
    }

    public static void AddAssignment(Assignment a) {
        arrAssignment.add(a);
    }

}
