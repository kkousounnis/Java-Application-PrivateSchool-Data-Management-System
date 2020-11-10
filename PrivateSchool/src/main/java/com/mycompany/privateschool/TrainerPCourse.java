package com.mycompany.privateschool;

import java.util.ArrayList;

public class TrainerPCourse {

    private Course course;
    private ArrayList<Trainer> trainersPCourse;

    TrainerPCourse(Course course) {
        this.course = course;
        trainersPCourse = new ArrayList<Trainer>();
    }

    public ArrayList<Trainer> getTrainersPerCourseList() {
        return trainersPCourse;
    }

    public void addTrainer(Trainer trainer) {
        this.trainersPCourse.add(trainer);
    }

    
}
