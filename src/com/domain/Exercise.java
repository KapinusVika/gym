package com.domain;
import java.util.List;

public class Exercise {
    private List<Training> exercises;

    public Exercise(List<Training> exercises) {
        this.exercises = exercises;
    }

    public List<Training> getExercises() {
        return exercises;
    }

    public void setExercises(List<Training> exercises) {
        this.exercises = exercises;
    }
}