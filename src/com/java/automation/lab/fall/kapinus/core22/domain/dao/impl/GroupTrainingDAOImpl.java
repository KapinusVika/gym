package com.java.automation.lab.fall.kapinus.core22.domain.dao.impl;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.GroupTraining;
import com.java.automation.lab.fall.kapinus.core22.domain.dao.GroupTrainingDAO;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.NotImplementetExc;

import java.util.List;

public class GroupTrainingDAOImpl implements GroupTrainingDAO {

    private static GroupTrainingDAOImpl instance;

    public static synchronized GroupTrainingDAOImpl getInstance() {
        if(instance == null){
            instance = new GroupTrainingDAOImpl();
        }
        return instance;
    }

    @Override
    public GroupTraining create(GroupTraining groupTraining) {
        return new GroupTraining(
                groupTraining.getName(),
                groupTraining.getTrainer(),
                groupTraining.getClients(),
                groupTraining.getDuration()
        );
    }

    @Override
    public GroupTraining getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<GroupTraining> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public GroupTraining update(GroupTraining groupTraining) {
        return new GroupTraining(
                groupTraining.getName(),
                groupTraining.getTrainer(),
                groupTraining.getClients(),
                groupTraining.getDuration()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteById");
    }
}
