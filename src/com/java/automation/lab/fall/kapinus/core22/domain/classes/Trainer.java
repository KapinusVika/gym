package com.java.automation.lab.fall.kapinus.core22.domain.classes;

import com.java.automation.lab.fall.kapinus.core22.domain.enums.TrainerSpecialization;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.AgeTrainerException;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.InvalidScheduleException;

import java.util.Arrays;

public class Trainer{
    private String name;
    private int age;
    private TrainerSpecialization trainerSpecialization;
    private int [][] schedule ;

    public Trainer(String name, int age, TrainerSpecialization trainerSpecialization,
                   int [][] schedule) throws AgeTrainerException, InvalidScheduleException {
        if(age < 18){
            throw new AgeTrainerException();
        }
        if(schedule == null){
            throw new InvalidScheduleException();
        }
        this.name = name;
        this.age = age;
        this.trainerSpecialization = trainerSpecialization;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public TrainerSpecialization getTrainerSpecialization() {
        return trainerSpecialization;
    }

    public void setTrainerSpecialization(TrainerSpecialization trainerSpecialization) {
        this.trainerSpecialization = trainerSpecialization;
    }

    public int [][] getSchedule(){
        return schedule;
    }

    public void setSchedule(int [][] schedule){
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "Trainer {\n\tname:" + name +
                "\n\tage:" + Integer.toString(age) +
                "\n\ttrainerSpecialization:" + trainerSpecialization +
                "\n\tschedule:" + Arrays.toString(schedule) +
                "\n}";
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
        return  name.equals(((Trainer)that).name) &&
                age == ((Trainer)that).age &&
                trainerSpecialization.equals(((Trainer)that).trainerSpecialization) &&
                schedule == ((Trainer)that).schedule;
    }

    @Override
    public int hashCode() {
        return (age + name.hashCode()) * 7;
    }
}