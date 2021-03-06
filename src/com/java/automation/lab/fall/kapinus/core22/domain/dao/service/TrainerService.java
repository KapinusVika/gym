package com.java.automation.lab.fall.kapinus.core22.domain.dao.service;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.Trainer;
import com.java.automation.lab.fall.kapinus.core22.domain.dao.TrainerDAO;
import com.java.automation.lab.fall.kapinus.core22.domain.dao.impl.TrainerDAOImpl;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.AgeTrainerException;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.InvalidScheduleException;

import java.util.List;

public class TrainerService {
    private static final TrainerDAO TRAINER_DAO = TrainerDAOImpl.getInstance();

    public static Trainer createTrainer(Trainer trainer) throws AgeTrainerException, InvalidScheduleException {
        return TRAINER_DAO.create(trainer);
    }

    public static Trainer getTrainerById(Long id){
        return TRAINER_DAO.getById(id);
    }

    public static List<Trainer> get(){
        return TRAINER_DAO.get();
    }

    public static Trainer update(Trainer trainer) throws AgeTrainerException, InvalidScheduleException {
        return TRAINER_DAO.update(trainer);
    }

    public  static Long deleteById(Long id){
        return TRAINER_DAO.deleteById(id);
    }
}
