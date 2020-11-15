package controller;

import java.util.Scanner;
import models.*;

public class WelcomeScreen {

    public Scanner scan = new Scanner(System.in);
    private int choice = 0;

    public WelcomeScreen() {

        Menu();
    }

    public void Menu() {
        showWelcomeMenu();
        //i assigned to 3 because i only 1,2,3 choices 
        this.choice = checkIntegerInput(3);
        switch (this.choice) {
            case 1:
                mainMenu();
                break;
            case 2:
                FakeDataCreate.intializeLists();
                mainMenu();
                break;
            case 3:
                System.out.println("Goodbey!!!");
                break;
        }
    }

    public void mainMenu() {
        showMainMenu();
        //i assigned to 3 because i only 1,2,3,4,5 choices 
        this.choice = checkIntegerInput(5);
        switch (this.choice) {
            case 1:
                courseMenu();
                break;
            case 2:
                studentMenu();
                break;
            case 3:
                trainerMenu(); 
                break;
            case 4:
                assignmentMenu();  
                break;
            case 5:
                clearConsole();
                Menu();
                break;

        }

    }

    public void courseMenu() {
        showCourseMenu();
        //i assigned to 3 because i only 1,2,3,4,5,6 choices 
        this.choice = checkIntegerInput(6);
        switch (this.choice) {
            case 1:
                UserInput.manualCourseList();
                courseMenu();
                break;
            case 2:
                ControllerData.showCourses();
                courseMenu();
                break;
            case 3:
                ControllerData.showStudentsPCourse();
                courseMenu();
                break;
            case 4:
                ControllerData.showTrainersPCourse();
                courseMenu();
                break;
            case 5:
                ControllerData.showAssignmentsPCourse();
                courseMenu();
                break;
            case 6:
                clearConsole();
                mainMenu();
                break;
        }

    }

    public void studentMenu() {
        showStudentMenu();
        //i assigned to 3 because i only 1,2,3,4,5,6 choices 
        this.choice = checkIntegerInput(6);
        switch (this.choice) {
            case 1:
                UserInput.manualStudentsLists();
                studentMenu();
                break;
            case 2:
                ControllerData.showStudents();
                studentMenu();
                break;
            case 3:
                ControllerData.showStudents();
                System.out.println("Please specify student "
                        + " from List by typing number");
                int studentIndex = checkIntegerInput(AddDataLists.getArrStudent().size());
                ControllerData.showCourses();
                System.out.println("Please tell me to which course"
                        + " will the student attend please type number of course.");
                int courseIndex = checkIntegerInput(AddDataLists.getArrCourse().size());
                ControllerData.setStudentsPCourse(AddDataLists.getArrCourse().get(courseIndex - 1),
                        AddDataLists.getArrStudent().get(studentIndex - 1));
                ControllerData.setCoursesPStudent(AddDataLists.getArrStudent().get(studentIndex - 1), AddDataLists.getArrCourse().get(courseIndex - 1));
                studentMenu();
                break;
            case 4:
                //assignment to do show student assignments
                clearConsole();
                ControllerData.showStudents();
                System.out.println("Please specify student "
                        + " from List by typing number");
                studentIndex = checkIntegerInput(AddDataLists.getArrStudent().size());                
                ControllerData.showStudentAssignments(AddDataLists.getArrStudent().get(studentIndex - 1));               
                studentMenu();
                break;
            case 5:
                //assignment to do show students who attend in more than one course
                ControllerData.showStudentsMultipleCourses(); 
                studentMenu();
                break;
            case 6:
                clearConsole();
                mainMenu();
                break;
        }

    }
    
    public void trainerMenu() {
        showTrainerMenu();
        //i assigned to 3 because i only 1,2,3,4,5,6 choices 
        this.choice = checkIntegerInput(6);
        switch (this.choice) {
            case 1:
                UserInput.manualTrainer();
                trainerMenu();
                break;
            case 2:
                ControllerData.showTrainers();
                trainerMenu();
                break;
            case 3:
                ControllerData.showTrainers();
                System.out.println("Please specify trainer "
                        + " from List by typing number");
                int trainerIndex = checkIntegerInput(AddDataLists.getArrTrainer().size());
                ControllerData.showCourses();
                System.out.println("Please tell me to which course"
                        + " will the trainer attend please type number of course.");
                int courseIndex = checkIntegerInput(AddDataLists.getArrCourse().size());
                ControllerData.setTrainersPCourse(AddDataLists.getArrCourse().get(courseIndex - 1),
                        AddDataLists.getArrTrainer().get(trainerIndex - 1));
                trainerMenu();
                break;
            case 4:
                clearConsole();
                mainMenu();
                break;      
        }

    }
    public void assignmentMenu() {
        showAssignmentMenu();
        //i assigned to 3 because i only 1,2,3,4 choices 
        this.choice = checkIntegerInput(6);
        switch (this.choice) {
            case 1:
                UserInput.manualAssignment();
                assignmentMenu();
                break;
            case 2:
                ControllerData.showAssignments();
                assignmentMenu();
                break;
            case 3:
                ControllerData.showAssignments();
                System.out.println("Please specify trainer "
                        + " from List by typing number");
                int assignmentIndex = checkIntegerInput(AddDataLists.getArrAssignment().size());
                ControllerData.showCourses();
                System.out.println("Please tell me to which course"
                        + " will the trainer attend please type number of course.");
                int courseIndex = checkIntegerInput(AddDataLists.getArrCourse().size());
                ControllerData.setAssignmentsPCourse(AddDataLists.getArrCourse().get(courseIndex - 1),
                        AddDataLists.getArrAssignment().get(assignmentIndex - 1));
                assignmentMenu();
                break;
            case 4:
                //to do
            case 5:
                clearConsole();
                mainMenu();
                break;      
        }

    }

    public void showWelcomeMenu() {
        System.out.println("---Welcome to Privete SchoolSA"
                + " where every dream becomes a reality---");
        for (int i = 0; i < 2; i++) {
            System.out.println("---                              "
                    + "                                 ---");
        }
        System.out.println("\nDescription of School");
        System.out.println("This is a private school which offers"
                + " intensive lessons for someone who desires"
                + " to learn.");
        System.out.println("Please choose how would you like to proceed.");
        System.out.println("1: Proceed to Main Menu.");
        System.out.println("2: Create fake data and proceed to Main Menu.");
        System.out.println("3: Terminate.");
    }

    public void showMainMenu() {
        System.out.println("       Main Menu      ");
        System.out.println("Please choose how would you like to proceed");
        System.out.println("1: Proceed to Course Menu.");
        System.out.println("2: Proceed to Student Menu.");
        System.out.println("3: Proceed to Trainer Menu.");
        System.out.println("4: Proceed to Assignment Menu.");
        System.out.println("5: Return to strat Menu.");

    }

    public void showCourseMenu() {
        System.out.println("       Course Menu      ");
        System.out.println("Please choose how would you like to proceed");
        System.out.println("1: Course Manualy create.");
        System.out.println("2: Show all courses.");
        System.out.println("3: Show students per course.");
        System.out.println("4: Show trainers per course.");
        System.out.println("5: Show assignments per course.");
        System.out.println("6: Return.");
    }

    public void showStudentMenu() {
        System.out.println("       Student Menu      ");
        System.out.println("Please choose how would you like to proceed");
        System.out.println("1: Create Manually student.");
        System.out.println("2: Show all student.");
        System.out.println("3: Choose student which lessons will attend.");
        System.out.println("4: Show student assignments");
        System.out.println("5: Show students who attend in"
                + " more than one course.");
        System.out.println("6: Return.");
    }

    void showTrainerMenu() {
        System.out.println("       Trainer Menu      ");
        System.out.println("Please choos how would you like to proceed.");
        System.out.println("1: Create Manually trainer.");
        System.out.println("2: Show all trainers");
        System.out.println("3: Choose trainer which lesson teaches.");
        System.out.println("4: Return.");
    }

    public void showAssignmentMenu() {
        System.out.println("       Assignment Menu      ");
        System.out.println("Please choose how would you like to proceed");
        System.out.println("1: Create manually assignment.");
        System.out.println("2: Show all assignments.");
        System.out.println("3: Choose course for assignment.");
        System.out.println("4: Show students with pending submisions");
        System.out.println("5: Return.");

    }

    public int checkIntegerInput(int x) {
        boolean catchexception = false;
        this.choice = 0;
        do {
            System.out.print("Enter a number to proceed : ");
            if (scan.hasNextInt()) {

                choice = scan.nextInt();
                if (choice >= 1 & choice <= x) {
                    catchexception = true;
                } else {
                    scan.nextLine();
                    System.out.println("Enter a valid Integer value");
                }
            } else {
                scan.nextLine();
                System.out.println("Enter a valid Integer value");
            }
        } while (!catchexception);
        return choice;
    }

    public static void clearConsole() {
        for (int i = 0; i < 80; i++) // Default Height of cmd is 300 and Default width is 80
        {
            System.out.println("");
        }
    }

}
