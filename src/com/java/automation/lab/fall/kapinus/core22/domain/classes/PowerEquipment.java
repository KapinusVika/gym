package com.java.automation.lab.fall.kapinus.core22.domain.classes;


public class PowerEquipment {
    private String name;
    private String workingMuscle;
    private double maxWorkingWeight;


    public PowerEquipment(String name, String workingMuscle,
                          double maxWorkingWeight){
        this.name = name;
        this.workingMuscle = workingMuscle;
        this.maxWorkingWeight = maxWorkingWeight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorkingMuscle() {
        return workingMuscle;
    }

    public void setWorkingMuscle(String workingMuscle) {
        this.workingMuscle = workingMuscle;
    }

    public double getMaxWorkingWeight() {
        return maxWorkingWeight;
    }

    public void setMaxWorkingWeight(double maxWorkingWeight) {
        this.maxWorkingWeight = maxWorkingWeight;
    }

    @Override
    public String toString() {
        return "PowerEquipment {\n\tname:" + name +
                "\n\tworkingMuscle:" + workingMuscle +
                "\n\tmaxWorkingWeight:" + Double.toString(maxWorkingWeight) +
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

        return  name.equals(((PowerEquipment)that).name) &&
                workingMuscle.equals(((PowerEquipment)that).workingMuscle) &&
                maxWorkingWeight == ((PowerEquipment)that).maxWorkingWeight;
    }

    @Override
    public int hashCode() {
        String mW = Double.toString(maxWorkingWeight);
        return (name.hashCode() * 13) + mW.hashCode();
    }
}
