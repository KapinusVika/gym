package com.java.automation.lab.fall.kapinus.core22.domain.dao.impl;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.Trainer;
import com.java.automation.lab.fall.kapinus.core22.domain.dao.TrainerDAO;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.AgeTrainerException;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.InvalidScheduleException;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.NotImplementetExc;

import java.util.List;

public class TrainerDAOImpl implements TrainerDAO {

    private static TrainerDAOImpl instance;

    public static synchronized TrainerDAOImpl getInstance() {
        if(instance == null){
            instance = new TrainerDAOImpl();
        }
        return instance;
    }

    private TrainerDAOImpl(){

    }

    @Override
    public Trainer create(Trainer trainer) throws AgeTrainerException, InvalidScheduleException {
        return new Trainer(
                trainer.getName(),
                trainer.getAge(),
                trainer.getTrainerSpecialization(),
                trainer.getSchedule());
    }

    @Override
    public Trainer getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<Trainer> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public Trainer update(Trainer trainer) throws AgeTrainerException, InvalidScheduleException{
        return new Trainer(
                trainer.getName(),
                trainer.getAge(),
                trainer.getTrainerSpecialization(),
                trainer.getSchedule());
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }
}
