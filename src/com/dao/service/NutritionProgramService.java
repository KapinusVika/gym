package com.dao.service;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.NutritionProgram;
import com.dao.daoAll.NutritionProgramDAO;
import com.dao.impl.NutritionProgramDAOImpl;

import java.util.List;

public class NutritionProgramService {

    private static final NutritionProgramDAO NUTRITION_PROGRAM_DAO = NutritionProgramDAOImpl.getInstance();

    public static NutritionProgram createClient(NutritionProgram nutritionProgram){
        return NUTRITION_PROGRAM_DAO.create(nutritionProgram);
    }

    public static NutritionProgram getClientById(Long id){
        return NUTRITION_PROGRAM_DAO.getById(id);
    }

    public static List<NutritionProgram> get(){
        return NUTRITION_PROGRAM_DAO.get();
    }

    public static NutritionProgram update(NutritionProgram nutritionProgram){
        return NUTRITION_PROGRAM_DAO.update(nutritionProgram);
    }

    public  static Long deleteById(Long id){
        return NUTRITION_PROGRAM_DAO.deleteById(id);
    }

}
