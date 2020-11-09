package com.java.automation.lab.fall.kapinus.core22.domain.classes;

import com.java.automation.lab.fall.kapinus.core22.domain.Booking;
import com.java.automation.lab.fall.kapinus.core22.domain.enums.AgeGroups;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.AgeClientException;

public class Client {
    private String name;
    private int age;
    private AgeGroups ageGroups;
    private Subscription subscription;
    private NutritionProgram nutritionProgram;
    private TrainingProgram trainingProgram;

    public Client(String name, int age, AgeGroups ageGroups, Subscription subscription,
                  NutritionProgram nutritionProgram, TrainingProgram trainingProgram) throws AgeClientException {
        if (age < 10) {
            throw new AgeClientException();
        }
        this.name = name;
        this.age = age;
        this.ageGroups = ageGroups;
        this.subscription = subscription;
        this.nutritionProgram = nutritionProgram;
        this.trainingProgram = trainingProgram;
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

    public AgeGroups getAgeGroups() {
        return ageGroups;
    }

    public void setAgeGroups(AgeGroups ageGroups) {
        this.ageGroups = ageGroups;
    }

    public NutritionProgram getNutritionProgram() {
        return nutritionProgram;
    }

    public void setNutritionProgram(NutritionProgram nutritionProgram) {
        this.nutritionProgram = nutritionProgram;
    }

    public TrainingProgram getTrainingProgram() {
        return trainingProgram;
    }

    public void setTrainingProgram(TrainingProgram trainingProgram) {
        this.trainingProgram = trainingProgram;
    }


        @Override
        public String toString() {
            return "Client {\n\tname:" + name +
                    "\n\tage:" + Integer.toString(age) +
                    "\n\tageGroups:" + ageGroups +
                    "\n\tnutritionProgram:" + nutritionProgram +
                    "\n\ttrainingProgram:" + trainingProgram +
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

            return name.equals(((Client) that).name) &&
                    age == ((Client) that).age &&
                    ageGroups.equals(((Client) that).ageGroups) &&
                    nutritionProgram.equals(((Client) that).nutritionProgram) &&
                    trainingProgram.equals(((Client) that).trainingProgram);
        }

        @Override
        public int hashCode() {
            return (age + name.hashCode()) * 11;
        }
    }

