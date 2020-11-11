package com.mycompany.privateschool;

public class ControllerData {

    ControllerData() {

    }

    public static void showStudents() {
        for (int i = 0; i < AddDataLists.getArrStudent().size(); i++) {
            System.out.println(AddDataLists.getArrStudent().get(i));
        }
    }

    public static void showCourses() {
        for (int i = 0; i < AddDataLists.getArrCourse().size(); i++) {
            System.out.println(i+": "+AddDataLists.getArrCourse().get(i));
        }
    }

    public static void showTrainer() {
        for (int i = 0; i < AddDataLists.getArrTrainer().size(); i++) {
            System.out.println(AddDataLists.getArrTrainer().get(i));
        }
    }

    public static void setStudentsPCourse(Course c, Student s) {        
        c.spc.AddStudentsPCourse(s);
    }
    public static void setTrainersPCourse(Course c, Trainer t) {        
        c.tpc.addTrainersPCourse(t);
    }
    public static void showStudentsPCourse(){
        for (Course c:AddDataLists.getArrCourse()){
            System.out.println(c.getTitle()+c.getStream());
            System.out.println(c.spc.getArrStudentsPCourse());   
        }
    }
    public static void showTrainersPCourse(){
        for (Course c:AddDataLists.getArrCourse()){
            System.out.println(c.getTitle()+c.getStream());
            System.out.println(c.tpc.getTrainersPCourseList());   
        }
    }
    
    

}
