package com.dao.impl;

import com.dao.daoModel.DAO;
import com.domain.Training;
import com.exceptions.NotImplementetExc;

import java.util.List;

public class TrainingDAOImpl implements DAO<Training> {

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
                training.getClient()
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
                training.getClient()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteByID");
    }
}
