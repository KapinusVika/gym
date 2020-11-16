package com.java.automation.lab.fall.kapinus.core22.domain.dao.impl;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.Training;
import com.java.automation.lab.fall.kapinus.core22.domain.dao.TrainingDAO;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.NotImplementetExc;

import java.util.List;

public class TrainingDAOImpl implements TrainingDAO {

    private static TrainingDAOImpl instance;

    public static synchronized TrainingDAOImpl getInstance() {
        if(instance == null){
            instance = new TrainingDAOImpl();
        }
        return instance;
    }

    @Override
    public Training create(Training training) {
        return new Training(
                training.getName(),
                training.getTrainer(),
                training.getClient(),
                training.getSets(),
                training.getReps()
        );
    }

    @Override
    public Training getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<Training> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public Training update(Training training) {
        return new Training(
                training.getName(),
                training.getTrainer(),
                training.getClient(),
                training.getSets(),
                training.getReps()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteByID");
    }
}
