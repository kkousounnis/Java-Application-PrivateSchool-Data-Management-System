package com.mycompany.privateschool;

import java.util.Date;

public class Student {

    private Person person;
    private long dateOfBirth;
    private int tuitionFees;
    private Course[] courses;

    Student(Person person) {
        this.person = person;
    }

    Student(Person person, Course[] courses) {
        this.person = person;
        this.courses = courses;
    }

    Student(Person person, long dateOfBirth, int tuitionFees) {
        this.person = person;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
    }

    public long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getTuitionFees() {
        return tuitionFees;
    }

    public void setTuitionFees(int tuitionFees) {
        this.tuitionFees = tuitionFees;
    }

    @Override
    public String toString() {
        return "Student{" + "person=" + person
                + ", dateOfBirth=" + ConvertDateLong.convertLong(dateOfBirth)
                + ", tuitionFees=" + tuitionFees + '}';
    }

}
