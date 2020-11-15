package models;

public class ControllerData {

    ControllerData() {

    }

    public static void showStudents() {
        for (int i = 0; i < AddDataLists.getArrStudent().size(); i++) {
            System.out.println((i + 1) + ": " + AddDataLists.getArrStudent().get(i));
        }
    }

    public static void showCourses() {
        for (int i = 0; i < AddDataLists.getArrCourse().size(); i++) {
            System.out.println((i + 1) + ": " + AddDataLists.getArrCourse().get(i));
        }
    }

    public static void showTrainers() {
        for (int i = 0; i < AddDataLists.getArrTrainer().size(); i++) {
            System.out.println((i + 1) + ": " + AddDataLists.getArrTrainer().get(i));
        }
    }

    public static void showAssignments() {
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

    public static void showAssignmentsPCourse() {
        for (Course c : AddDataLists.getArrCourse()) {
            System.out.println(c.getTitle() + c.getStream());
            System.out.println(c.assignmentPerCourse.getAssignmentPCourse());
        }
    }
    public static void showStudentAssignments(Student s) {
        for (Course c : s.coursesPStudent.getArrCoursesPStudent()) {
            System.out.println(c.getTitle() + c.getStream());
            System.out.println(c.assignmentPerCourse.getAssignmentPCourse());
        }
    }

    public static void showStudentsMultipleCourses() {
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
