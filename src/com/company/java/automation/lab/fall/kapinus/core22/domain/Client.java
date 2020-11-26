package com.java.automation.lab.fall.kapinus.core22.domain;


import com.java.automation.lab.fall.kapinus.core22.enums.AgeGroups;
import com.java.automation.lab.fall.kapinus.core22.exceptions.AgeClientException;
import java.io.Serializable;
import java.util.Objects;

public class Client implements Serializable {
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

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ageGroups=" + ageGroups +
                ", subscription=" + subscription +
                ", nutritionProgram=" + nutritionProgram +
                ", trainingProgram=" + trainingProgram +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age &&
                Objects.equals(name, client.name) &&
                ageGroups == client.ageGroups &&
                Objects.equals(subscription, client.subscription) &&
                Objects.equals(nutritionProgram, client.nutritionProgram) &&
                Objects.equals(trainingProgram, client.trainingProgram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, ageGroups, subscription, nutritionProgram, trainingProgram);
    }
}

