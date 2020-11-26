package com.java.automation.lab.fall.kapinus.core22.domain.classes;

import com.exceptions.InvalidCaloriesException;

public class NutritionFacts {
    private double caloriesPerDay;
    private double proteinPerDay;
    private double carbohydratesPerDay;
    private double fatsPerDay;

    public NutritionFacts(double caloriesPerDay, double proteinPerDay,
                          double carbohydratesPerDay, double fatsPerDay) throws InvalidCaloriesException {
        if(caloriesPerDay < 1200){
            throw new InvalidCaloriesException();
        }
        this.caloriesPerDay = caloriesPerDay;
        this.proteinPerDay = proteinPerDay;
        this.carbohydratesPerDay = carbohydratesPerDay;
        this.fatsPerDay = fatsPerDay;
    }

    public double getCaloriesPerDay() {
        return caloriesPerDay;
    }

    public void setCaloriesPerDay(double caloriesPerDay) {
        this.caloriesPerDay = caloriesPerDay;
    }

    public double getProteinPerDay() {
        return proteinPerDay;
    }

    public void setProteinPerDay(double proteinPerDay) {
        this.proteinPerDay = proteinPerDay;
    }

    public double getCarbohydratesPerDay() {
        return carbohydratesPerDay;
    }

    public void setCarbohydratesPerDay(double carbohydratesPerDay) {
        this.carbohydratesPerDay = carbohydratesPerDay;
    }

    public double getFatsPerDay() {
        return fatsPerDay;
    }

    public void setFatsPerDay(double fatsPerDay) {
        this.fatsPerDay = fatsPerDay;
    }

    @Override
    public String toString() {
        return "NutritionFacts {\n\tcaloriesPerDay:" + Double.toString(caloriesPerDay) +
                "\n\tproteinPerDay:" + Double.toString(proteinPerDay) +
                "\n\tcarbohydratesPerDay:" + Double.toString(carbohydratesPerDay) +
                "\n\tfatsPerDay:" + Double.toString(fatsPerDay) +
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
        return  caloriesPerDay == ((NutritionFacts)that).caloriesPerDay &&
                proteinPerDay == ((NutritionFacts)that).proteinPerDay &&
                carbohydratesPerDay == ((NutritionFacts)that).carbohydratesPerDay &&
                fatsPerDay == ((NutritionFacts)that).fatsPerDay;
    }

    @Override
    public int hashCode() {
        String cPd = Double.toString(caloriesPerDay);
        String pPd = Double.toString(proteinPerDay);
        return (pPd.hashCode() + cPd.hashCode()) * 3;
    }
}