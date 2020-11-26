package com.java.automation.lab.fall.kapinus.core22.dao.service;

import com.java.automation.lab.fall.kapinus.core22.domain.TrainingProgram;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.TrainingProgramDAO;
import com.java.automation.lab.fall.kapinus.core22.dao.impl.TrainingProgramDAOImpl;

import java.util.List;

public class TrainingProgramService {

    private static final TrainingProgramDAO TRAINING_PROGRAM_DAO = TrainingProgramDAOImpl.getInstance();

    public static TrainingProgram createClient(TrainingProgram trainingProgram){
        return TRAINING_PROGRAM_DAO.create(trainingProgram);
    }

    public static TrainingProgram getClientById(Long id){
        return TRAINING_PROGRAM_DAO.getById(id);
    }

    public static List<TrainingProgram> get(){
        return TRAINING_PROGRAM_DAO.get();
    }

    public static TrainingProgram update(TrainingProgram trainingProgram){
        return TRAINING_PROGRAM_DAO.update(trainingProgram);
    }

    public  static Long deleteById(Long id){
        return TRAINING_PROGRAM_DAO.deleteById(id);
    }
}
