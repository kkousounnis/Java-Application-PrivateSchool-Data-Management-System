package models;

import controller.WelcomeScreen;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UserInput {

    UserInput() {

    }

    public static void manualStudentsLists() {
        WelcomeScreen.clearConsole();
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        Student s;
        String[] student;
        if (multipleOrStepBystepInput()) {

            System.out.println("Please give me students first name.");
            p.setFirstName(checkStringInputLength());
            System.out.println("Please give me students last name.");
            p.setLastName(checkStringInputLength());
            System.out.println("Please give me students date of birth."
                    + "Type date of birth like this (DD/MM/YYY).");
            s = new Student(p.getFirstName(), p.getLastName());
            s.setDateOfBirth(checkDateInput());
            System.out.println("Please give me the tuition fees of student.");
            s.setTuitionFees(checkIntInput());
        } else {
            do {
                System.out.println("Give inputs with this priority \n-> "
                        + "[firsname lastname (DD/MM/YYY) tuitionfees]:");
                System.out.println("Warning in third input below please"
                        + " enter DoB like this (DD/MM/YYY)\n");

                String allInputs = sc.nextLine();
                student = allInputs.split(" ");
            } while (student.length != 4);
            p.setFirstName(student[0]);
            p.setLastName(student[1]);
            s = new Student(p.getFirstName(), p.getLastName());

            s.setDateOfBirth(checkMultipleDateInput(student[2]));
            s.setTuitionFees(Integer.parseInt(student[3]));

        }
        AddDataLists.AddStudentsLists(s);
        if (AddDataLists.getArrCourse().size() > 0) {
            ControllerData.showCourses();
            System.out.println("Please tell me to which course"
                    + " will the student attend");
            int courseIndex = checkIntegerInput(AddDataLists.getArrCourse().size());
            ControllerData.setStudentsPCourse(AddDataLists.getArrCourse().get(courseIndex - 1), s);
            ControllerData.setCoursesPStudent(s, AddDataLists.getArrCourse().get(courseIndex - 1));
        } else {
            System.out.println("\n---No courses have been assigned yet.---\n");
        }

    }

    public static void manualCourseList() {
        Scanner sc = new Scanner(System.in);
        char tmp;
        TitleName t1;
        Course c;
        if (multipleOrStepBystepInput()) {
            WelcomeScreen.clearConsole();
            System.out.println("Please give the title of course.");
            t1 = new TitleName(checkStringInputLength());
            c = new Course(t1);
            System.out.println("Please give the name of course");
            c.setStream(checkStringInputLength());
//            do {
            System.out.println("Please type (f) if it is FullTime"
                    + " or type (p) if it is PartTime");
            tmp = sc.next().charAt(0);
//            } while (checkInputType(tmp) == false);
            c.setType(checkPartTimeFullTimeInput(tmp));
            System.out.println("Please give me the start date of the course");
            c.setStartDate(checkDateInput());
            System.out.println("Please give me the ending date of the course");
            c.setEndDate(checkDateInput());
        } else {
            WelcomeScreen.clearConsole();
            System.out.println("[coursetitle stream (f)/(p) "
                    + "startdate enddate]");
            System.out.println("Warning for third input."
                    + "Please type (f) if it is FullTime"
                    + " or type (p) if it is PartTime");
            String allInputs = sc.nextLine();
            String[] student = allInputs.split(" ");
            t1 = new TitleName(student[0]);
            c = new Course(t1);
            c.setStream(student[1]);
            c.setType(checkPartTimeFullTimeInput(student[2].charAt(0)));
            c.setStartDate(checkMultipleDateInput(student[3]));
            c.setEndDate(checkMultipleDateInput(student[4]));
        }

        AddDataLists.AddCourseList(c);

    }

    public static void manualTrainer() {
        Scanner sc = new Scanner(System.in);
        Person p = new Person();
        Trainer t;
        if (multipleOrStepBystepInput()) {

            System.out.println("Please give me trainers first name.");
            p.setFirstName(checkStringInputLength());
            System.out.println("Please give me trainers last name.");
            p.setLastName(checkStringInputLength());
            t = new Trainer(p.getFirstName(), p.getLastName());
            System.out.println("Please give me what subject the trainer teaches");
            t.setSubject(checkStringInputLength());
        } else {
            String[] trainer;
            do {
                System.out.println("[firstname lastname subject]");
                String allInputs = sc.nextLine();
                trainer = allInputs.split(" ");
            } while (trainer.length != 3);
            p.setFirstName(trainer[0]);
            p.setLastName(trainer[1]);
            t = new Trainer(p.getFirstName(), p.getLastName());
            t.setSubject(trainer[2]);

        }

        AddDataLists.AddTrainer(t);
        if (AddDataLists.getArrCourse().size() > 0) {
            ControllerData.showCourses();
            System.out.println("Please tell me which course"
                    + " will the trainer teach");
            ControllerData.setTrainersPCourse(AddDataLists.getArrCourse().get(sc.nextInt() - 1), t);
        } else {
            System.out.println("\n---No courses have been assigned yet.---\n");
        }
    }

    public static void manualAssignment() {
        Scanner sc = new Scanner(System.in);
        TitleName title1;
        Assignment a;
        if (multipleOrStepBystepInput()) {
            System.out.println("Please give me the title of assignment");
            title1 = new TitleName(checkStringInputLength());

            a = new Assignment(title1);
            System.out.println("Please give me a description of assignment");
            a.setDescription(sc.nextLine());
            System.out.println("Please give me a date to assign ");
            a.setSubDateTime(checkDateInput());
        } else {
            String[] assignment;
            do {
                System.out.println("[assignmenttitle assignmentdate description ]");
                String allInputs = sc.nextLine();
                assignment = allInputs.split(" ");
            } while (assignment.length < 15);
            title1 = new TitleName(assignment[0]);
            a = new Assignment(title1);
            a.setSubDateTime(checkMultipleDateInput(assignment[1]));
            String s = "";
            for (int i = 2; i < assignment.length; i++) {
                s = s + " " + assignment[i];
            }

            a.setDescription(s);

        }
        AddDataLists.AddAssignment(a);
        if (AddDataLists.getArrCourse().size() > 0) {
            ControllerData.showCourses();
            System.out.println("Please tell to which course assignment belongs");
            ControllerData.setAssignmentsPCourse(AddDataLists.getArrCourse().get(sc.nextInt() - 1), a);
        } else {
            System.out.println("\n---No courses have been assigned yet.---\n");
        }
    }

    //------------
    //checks
    public static boolean checkInputType(char s) {
        switch (s) {
            case 'f':
                return true;
            case 'p':
                return true;
        }
        return false;
    }

    public static boolean decidePartFullTime(char s) {
        return (s == 'f');
    }

    public static boolean multipleOrStepBystepInput() {
        System.out.println("Choose the way you want to insert "
                + " your values");
        System.out.println("Type 1 for step by step input Press 2 "
                + "for multiple inputs");

        return (checkIntegerInput(2) == 1);
    }

    public static int checkIntegerInput(int x) {
        Scanner scan = new Scanner(System.in);
        boolean catchexception = false;
        int choice = 0;
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

    public static long checkDateInput() {
        Scanner scan = new Scanner(System.in);
        boolean correctFormat = false;
        String dateOB = "";
        do {
            System.out.println(" please enter DoB like this (DD/MM/YYY)");
            dateOB = scan.next();
            try {
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateOB);
                //if date hase a correct format the program shall continue
                correctFormat = true;

            } catch (ParseException e) {

                correctFormat = false;
            }
        } while (!correctFormat);
        //i return date of birth as a string and 
        return ConvertDateLong.convertDate(dateOB);
    }
    public static long askUserDateToShowStudentsWeekAssignments() {
        Scanner scan = new Scanner(System.in);
        boolean correctFormat = false;
        String dateOB = "";
        do {
            System.out.println(" please enter the date you wish to see "
                    + "all relevant student assignments"
                    + "\n The must be typed like this (DD/MM/YYY)");
            dateOB = scan.next();
            try {
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateOB);
                //if date hase a correct format the program shall continue
                correctFormat = true;

            } catch (ParseException e) {

                correctFormat = false;
            }
        } while (!correctFormat);
        //i return date of birth as a string and 
        return ConvertDateLong.convertDate(dateOB);
    }
    

    public static long checkMultipleDateInput(String dateOfBirth) {
        Scanner scan = new Scanner(System.in);
        boolean correctFormat = false;
        String dateOB = dateOfBirth;
        boolean firstTimePass = false;
        do {

            if (firstTimePass == true) {
                System.out.println(" please enter DoB like this (DD/MM/YYY)");
                dateOB = scan.next();
            }
            try {
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateOB);
                //if date hase a correct format the program shall continue
                correctFormat = true;

            } catch (ParseException e) {
                firstTimePass = true;
                correctFormat = false;
            }
        } while (!correctFormat);
        //i return date of birth as a string and 
        return ConvertDateLong.convertDate(dateOB);
    }

    public static String checkStringInputLength() {
        Scanner scan = new Scanner(System.in);
        boolean correctFormat = false;

        String stringInput = "";
        do {
            stringInput = scan.nextLine();
            String[] stringSplit = stringInput.split(" ");

            if (stringSplit.length == 1) {
                correctFormat = true;
            } else {
                System.out.println("There must be only one word,"
                        + " spaces aren't allowed.Try again.");

            }

        } while (!correctFormat);

        return stringInput;
    }

    public static int checkIntInput() {
        Scanner in = new Scanner(System.in);

        // INPUT VALIDATION FOR INTEGERS AND POSITIVE NUMBERS
        int input = 0;
        boolean validationSuccessful = false;
        do {

            // validate that the input is an integer
            if (in.hasNextInt() == true) {
                input = in.nextInt();
            } else {
                System.out.print("Please enter an integer value: ");
                in.next();
                continue;
            }

            // validate that the input is positive
            if (input < 0) {
                System.out.print("Please print a POSITIVE integer: ");
                continue;
            } else {
                validationSuccessful = true;
            }
            System.out.println("The input is: " + input);
        } while (validationSuccessful == false);
        return input;
    }

    public static boolean checkPartTimeFullTimeInput(char c) {
        Scanner sc = new Scanner(System.in);
        while (checkInputType(c) == false) {
            System.out.println("Please type (f) if it is FullTime"
                    + " or type (p) if it is PartTime");
            c = sc.next().charAt(0);
        }
        return decidePartFullTime(c);
    }

}
