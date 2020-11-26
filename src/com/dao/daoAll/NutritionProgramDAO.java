package com.dao.daoAll;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.NutritionProgram;

import java.util.List;

public interface NutritionProgramDAO {
    NutritionProgram create (NutritionProgram nutritionProgram);
    NutritionProgram getById(Long id);
    List<NutritionProgram> get();
    NutritionProgram update(NutritionProgram nutritionProgram);
    Long deleteById(Long id);
}
