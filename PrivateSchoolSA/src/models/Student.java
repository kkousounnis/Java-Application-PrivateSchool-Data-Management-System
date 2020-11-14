package models;


import privateschool.*;
import java.util.Date;

public class Student extends Person{

    //private Person person;
    private long dateOfBirth;
    private int tuitionFees; 
    
    Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    

    Student(String firstName, String lastName, long dateOfBirth, int tuitionFees) {
        super(firstName, lastName);
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
        return "Student{" + "person="+super.getFirstName()+super.getLastName()
                + ", dateOfBirth=" + ConvertDateLong.convertLong(dateOfBirth)
                + ", tuitionFees=" + tuitionFees + '}';
    }

}
