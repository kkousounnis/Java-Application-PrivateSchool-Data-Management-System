package com.mycompany.privateschool;

public class ShowLists {

    ShowLists() {

    }

    public static void showStudents() {
        for (int i = 0; i < AddDataToLists.getArrStudent().size(); i++) {
            System.out.println(AddDataToLists.getArrStudent().get(i));
        }
    }

    public static void showCourses() {
        for (int i = 0; i < AddDataToLists.getArrCourse().size(); i++) {
            System.out.println(AddDataToLists.getArrCourse().get(i));
        }
    }

    public static void showTrainer() {
        for (int i = 0; i < AddDataToLists.getArrTrainer().size(); i++) {
            System.out.println(AddDataToLists.getArrTrainer().get(i));
        }
    }
}
