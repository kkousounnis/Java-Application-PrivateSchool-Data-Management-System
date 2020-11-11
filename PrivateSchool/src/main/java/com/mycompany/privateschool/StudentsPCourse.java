package com.mycompany.privateschool;

import java.util.ArrayList;

public class StudentsPCourse {

    private ArrayList<Student> arrStudentsPCourse;
    private Course course;

    StudentsPCourse(Course course) {
        this.course = course;
        arrStudentsPCourse = new ArrayList<Student>();
    }
    StudentsPCourse() {
        arrStudentsPCourse = new ArrayList<Student>();
    }

    public ArrayList<Student> getArrStudentsPCourse() {
        return arrStudentsPCourse;
    }

    public void AddStudentsPCourse(Student s) {
        this.arrStudentsPCourse.add(s);
    }


}
