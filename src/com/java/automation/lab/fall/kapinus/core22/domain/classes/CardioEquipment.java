package com.java.automation.lab.fall.kapinus.core22.domain.classes;


import java.util.Objects;

public class CardioEquipment extends Equipment{
    private double maxWeight;

    public CardioEquipment(String name, double maxWeight){
        super(name);
        this.maxWeight = maxWeight;
    }


    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }


    @Override
    public String toString() {
        return "CardioEquipment{" +
                "maxWeight=" + maxWeight +
                '}';
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
        return maxWeight == ((CardioEquipment)that).maxWeight;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxWeight);
    }
}
