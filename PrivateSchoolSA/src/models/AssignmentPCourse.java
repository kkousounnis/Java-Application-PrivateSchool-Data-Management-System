package models;

import java.util.ArrayList;

public class AssignmentPCourse {

    private Course course;
    private final ArrayList<Assignment> assignmentPCourse;

    AssignmentPCourse() {
        assignmentPCourse = new ArrayList<>();
    }

    AssignmentPCourse(Course course) {
        this.course = course;
        assignmentPCourse = new ArrayList<>();
    }

    public ArrayList<Assignment> getAssignmentPCourse() {
        return assignmentPCourse;
    }

    public void addAssignmentPCourse(Assignment assignment) {
        this.assignmentPCourse.add(assignment);
    }
}
