package com.java.automation.lab.fall.kapinus.core22.domain.classes;


public class CardioEquipment {
    private String name;
    private double maxWeight;

    public CardioEquipment(String name, double maxWeight){
        this.name = name;
        this.maxWeight = maxWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        return "CardioEquipment {\n\tname:" + name +
                "\n\tmaxWeight:" + Double.toString(maxWeight) + "\n}";
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
        return  name.equals(((CardioEquipment)that).name) &&
                maxWeight == ((CardioEquipment)that).maxWeight;
    }

    @Override
    public int hashCode() {
        return (name.hashCode() * 31);
    }
}
