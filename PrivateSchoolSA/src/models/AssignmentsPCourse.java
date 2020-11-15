package models;

import java.util.ArrayList;

public class AssignmentsPCourse {

    private Course course;
    private final ArrayList<Assignment> assignmentPCourse;

    AssignmentsPCourse() {
        assignmentPCourse = new ArrayList<>();
    }

    AssignmentsPCourse(Course course) {
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
