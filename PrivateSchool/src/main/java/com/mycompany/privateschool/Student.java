package com.mycompany.privateschool;

import java.util.Date;

public class Student {

    private Person person;
    private Date dateOfBirth;
    private int tuitionFees;

    Student(Person person) {
        this.person = person;
    }

    Student(Person person, Date dateOfBirth, int tuitionFees) {
        this.person = person;
        this.dateOfBirth = dateOfBirth;
        this.tuitionFees = tuitionFees;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
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
