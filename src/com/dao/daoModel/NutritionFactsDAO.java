package com.dao.daoModel;

import com.domain.NutritionFacts;
import com.exceptions.InvalidCaloriesException;

import java.util.List;

public interface NutritionFactsDAO {
    NutritionFacts create (NutritionFacts nutritionFacts) throws InvalidCaloriesException;
    NutritionFacts getById(Long id);
    List<NutritionFacts> get();
    NutritionFacts update(NutritionFacts nutritionFacts) throws InvalidCaloriesException;
    Long deleteById(Long id);
}
