package com.java.automation.lab.fall.kapinus.core22.dao.service;

import com.java.automation.lab.fall.kapinus.core22.domain.NutritionProgram;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.NutritionProgramDAO;
import com.java.automation.lab.fall.kapinus.core22.dao.impl.NutritionProgramDAOImpl;

import java.util.List;

public class NutritionProgramService {

    private static final PropertyReader PROPS = PropertyReader.getInstance();
    private static final Map<String, NutritionProgram> NUTRITION_PROGRAM_DAOS = Map.of(
            "MOCK", new com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.NutritionProgramDAOImpl(),
            );

    private static final NutritionProgramDAO NUTRITION_PROGRAM_DAO=
            NUTRITION_PROGRAM_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

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
