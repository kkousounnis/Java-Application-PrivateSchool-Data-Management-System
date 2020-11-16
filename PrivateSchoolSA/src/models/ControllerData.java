package models;

public class ControllerData {

    ControllerData() {

    }

    public static void showStudents() {
        System.out.println("---Students---");
        for (int i = 0; i < AddDataLists.getArrStudent().size(); i++) {
            System.out.println((i + 1) + ": " + AddDataLists.getArrStudent().get(i));
        }
    }

    public static void showCourses() {
        System.out.println("---Courses---");
        for (int i = 0; i < AddDataLists.getArrCourse().size(); i++) {
            System.out.println((i + 1) + ": " + AddDataLists.getArrCourse().get(i));
        }
    }

    public static void showTrainers() {
        System.out.println("Trainers");
        for (int i = 0; i < AddDataLists.getArrTrainer().size(); i++) {
            System.out.println((i + 1) + ": " + AddDataLists.getArrTrainer().get(i));
        }
    }

    public static void showAssignments() {
        System.out.println("Assignments");
        for (int i = 0; i < AddDataLists.getArrAssignment().size(); i++) {
            System.out.println((i + 1) + ": " + AddDataLists.getArrAssignment().get(i));
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

    public static void setCoursesPStudent(Student s, Course c) {
        s.coursesPStudent.AddStudentsPCourse(c);
    }

    public static void showStudentsPCourse() {
        System.out.println("---Students Per Course---");
        for (Course c : AddDataLists.getArrCourse()) {
            System.out.println(c.getTitle() + c.getStream());
            System.out.println(c.studentsPerCourse.getArrStudentsPCourse());
        }
    }

    public static void showTrainersPCourse() {
        System.out.println("---Trainer Per Course---");
        for (Course c : AddDataLists.getArrCourse()) {
            System.out.println(c.getTitle() + c.getStream());
            System.out.println(c.trainerPerCourse.getTrainersPCourseList());
        }
    }

    public static void showAssignmentsPCourse() {
        System.out.println("---Assignments Per Course---");
        for (Course c : AddDataLists.getArrCourse()) {
            System.out.println(c.getTitle() + c.getStream());
            System.out.println(c.assignmentPerCourse.getAssignmentPCourse());
        }
    }
    public static void showStudentAssignments(Student s) {
        System.out.println("---Students Per Assignment---");
        for (Course c : s.coursesPStudent.getArrCoursesPStudent()) {
            System.out.println(c.getTitle() + c.getStream());
            System.out.println(c.assignmentPerCourse.getAssignmentPCourse());
        }
    }

    public static void showStudentsMultipleCourses() {
        System.out.println("Students who  Attend Multiple Courses");
        System.out.println("Students in multiple courses");
        for (Student student : AddDataLists.getArrStudent()) {
            if (student.coursesPStudent.getArrCoursesPStudent().size() > 1) {
                System.out.println(student);
                System.out.println("Attends the courses below:");
                System.out.println(student.coursesPStudent.getArrCoursesPStudent());
            }
        }

    }

}
