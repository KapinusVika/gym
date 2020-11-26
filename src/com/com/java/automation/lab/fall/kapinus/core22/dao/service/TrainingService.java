package com.java.automation.lab.fall.kapinus.core22.dao.service;

import com.java.automation.lab.fall.kapinus.core22.domain.Training;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.TrainingDAO;
import com.java.automation.lab.fall.kapinus.core22.dao.impl.TrainingDAOImpl;

import java.util.List;

public class TrainingService {

    private static final TrainingDAO TRAINING_DAO = TrainingDAOImpl.getInstance();

    public static Training createTraining(Training training){
        return TRAINING_DAO.create(training);
    }

    public static Training getTrainingById(Long id){
        return TRAINING_DAO.getById(id);
    }

    public static List<Training> get(){
        return TRAINING_DAO.get();
    }

    public static Training update(Training training){
        return TRAINING_DAO.update(training);
    }

    public static Long deleteById(Long id){
        return TRAINING_DAO.deleteById(id);
    }
}
