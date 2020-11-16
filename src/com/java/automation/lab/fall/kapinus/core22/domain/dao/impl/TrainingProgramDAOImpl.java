package com.java.automation.lab.fall.kapinus.core22.domain.dao.impl;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.TrainingProgram;
import com.java.automation.lab.fall.kapinus.core22.domain.dao.TrainingProgramDAO;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.NotImplementetExc;

import java.util.List;

public class TrainingProgramDAOImpl implements TrainingProgramDAO {

    private static TrainingProgramDAOImpl instance;

    public static synchronized TrainingProgramDAOImpl getInstance() {
        if(instance == null){
            instance = new TrainingProgramDAOImpl();
        }
        return instance;
    }


    @Override
    public TrainingProgram create(TrainingProgram trainingProgram) {
        return new TrainingProgram(
                trainingProgram.getNameTraining(),
                trainingProgram.getExercises());
    }

    @Override
    public TrainingProgram getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<TrainingProgram> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public TrainingProgram update(TrainingProgram trainingProgram) {
        return new TrainingProgram(
                trainingProgram.getNameTraining(),
                trainingProgram.getExercises());
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteById");
    }
}
