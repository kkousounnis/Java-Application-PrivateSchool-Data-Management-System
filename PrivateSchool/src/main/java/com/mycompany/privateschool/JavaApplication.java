package com.mycompany.privateschool;

import java.util.ArrayList;

public class JavaApplication {

    public static void main(String[] args) {
        FakeDataCreate.intializeLists();
        ControllerData.showStudents();
        System.out.println("--------");
        ControllerData.showCourses();
        System.out.println("--------");
        ControllerData.showTrainer();
        System.out.println("---------apo edw kai katw");
        
         
        for (Course c:AddDataLists.getArrCourse()){
            System.out.println(c.getTitle()+c.getStream());
            System.out.println(c.spc.getArrStudentsPCourse());
        
        }
    }
    
     
    
    
}
