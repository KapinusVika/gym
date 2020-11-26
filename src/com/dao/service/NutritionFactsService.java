package com.dao.service;

import com.domain.NutritionFacts;
import com.dao.daoModel.NutritionFactsDAO;
import com.dao.impl.NutritionFactsDAOImpl;
import com.exceptions.InvalidCaloriesException;

import java.util.List;

public class NutritionFactsService {

    private static final NutritionFactsDAO NUTRITION_FACTS_DAO = NutritionFactsDAOImpl.getInstance();

    public static NutritionFacts createNutritionFacts(NutritionFacts nutritionFacts) throws InvalidCaloriesException {
        return NUTRITION_FACTS_DAO.create(nutritionFacts);
    }

    public static NutritionFacts getNutritionFactsById(Long id){
        return NUTRITION_FACTS_DAO.getById(id);
    }

    public static List<NutritionFacts> get(){
        return NUTRITION_FACTS_DAO.get();
    }

    public static NutritionFacts update(NutritionFacts nutritionFacts) throws InvalidCaloriesException {
        return NUTRITION_FACTS_DAO.update(nutritionFacts);
    }

    public  static Long deleteById(Long id){
        return NUTRITION_FACTS_DAO.deleteById(id);
    }
}

