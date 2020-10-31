package com.java.automation.lab.fall.kapinus.core22.domain.classes;

import java.util.List;

public class TrainingProgram {
    private String nameTraining;
    private List<Training> exercises;


    public TrainingProgram(String nameTraining, List<Training> exercises){
        this.nameTraining = nameTraining;
        this.exercises = exercises;

    }

    public String getNameTraining() {
        return nameTraining;
    }

    public void setNameTraining(String nameTraining) {
        this.nameTraining = nameTraining;
    }

    public List<Training> getExercises() {
        return exercises;
    }

    public void setExercises(List<Training> exercises) {
        this.exercises = exercises;
    }

    @Override
    public String toString() {
        return "TrainingProgram {\n\tnameTraining:" + nameTraining +
                "\n\texercises:" + exercises + "\n}";
    }

    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        if (this == that) {
            return true;
        }
        return  nameTraining.equals(((TrainingProgram)that).nameTraining) &&
                exercises.equals(((TrainingProgram)that).exercises);
    }

    @Override
    public int hashCode() {
        return (nameTraining.hashCode() * 5) + 101;
    }
}