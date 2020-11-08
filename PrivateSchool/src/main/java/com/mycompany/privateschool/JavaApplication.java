package com.mycompany.privateschool;

public class JavaApplication {

    public static void main(String[] args) {
        InitializePrintLists.intializeLists();
        InitializePrintLists.showStudents();
        //InitializePrintLists.manualStudentsLists();
        InitializePrintLists.showStudents();
        InitializePrintLists.showCourses();
        System.out.println("--------");
        //InitializePrintLists.manualCourseList();
        InitializePrintLists.showCourses();
        System.out.println("--------");
        InitializePrintLists.showTrainer();
        InitializePrintLists.manualTrainer();
        InitializePrintLists.showTrainer();
        
    }
}
