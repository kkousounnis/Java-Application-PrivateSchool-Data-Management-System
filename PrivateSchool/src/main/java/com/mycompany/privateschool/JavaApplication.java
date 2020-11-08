package com.mycompany.privateschool;

public class JavaApplication {

    public static void main(String[] args) {
        UserInput.manualCourseList();
        ShowLists.showCourses();
        System.out.println("---------");
        UserInput.manualStudentsLists();
        ShowLists.showStudents();
        System.out.println("---------");
        UserInput.manualTrainer();
        ShowLists.showTrainer();
          
    }
}
