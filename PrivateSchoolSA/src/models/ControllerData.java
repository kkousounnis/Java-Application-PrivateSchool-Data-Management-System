package models;

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
            System.out.println(i + ": " + AddDataLists.getArrCourse().get(i));
        }
    }

    public static void showTrainer() {
        for (int i = 0; i < AddDataLists.getArrTrainer().size(); i++) {
            System.out.println(AddDataLists.getArrTrainer().get(i));
        }
    }

    public static void setStudentsPCourse(Course c, Student s) {
        c.studentsPerCourse.AddStudentsPCourse(s);
    }

    public static void setTrainersPCourse(Course c, Trainer t) {
        c.trainerPerCourse.addTrainersPCourse(t);
    }

    public static void setAssignmentsPCourse(Course c, Assignment a) {
        c.assignmentPerCourse.addAssignmentPCourse(a);
    }

    public static void showStudentsPCourse() {
        for (Course c : AddDataLists.getArrCourse()) {
            System.out.println(c.getTitle() + c.getStream());
            System.out.println(c.studentsPerCourse.getArrStudentsPCourse());
        }
    }

    public static void showTrainersPCourse() {
        for (Course c : AddDataLists.getArrCourse()) {
            System.out.println(c.getTitle() + c.getStream());
            System.out.println(c.trainerPerCourse.getTrainersPCourseList());
        }
    }

    public static void showAssignmentPCourse() {
        for (Course c : AddDataLists.getArrCourse()) {
            System.out.println(c.getTitle() + c.getStream());
            System.out.println(c.assignmentPerCourse.getAssignmentPCourse());
        }
    }

}
