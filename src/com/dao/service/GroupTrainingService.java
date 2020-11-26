package com.dao.service;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.GroupTraining;
import com.dao.daoAll.GroupTrainingDAO;
import com.dao.impl.GroupTrainingDAOImpl;

import java.util.List;

public class GroupTrainingService {

    private static final GroupTrainingDAO GROUP_TRAINING_DAO = GroupTrainingDAOImpl.getInstance();

    public static GroupTraining createGroupTraining(GroupTraining groupTraining){
        return GROUP_TRAINING_DAO.create(groupTraining);
    }

    public static GroupTraining getGroupTrainingById(Long id){
        return GROUP_TRAINING_DAO.getById(id);
    }

    public static List<GroupTraining> get(){
        return GROUP_TRAINING_DAO.get();
    }

    public static GroupTraining update(GroupTraining groupTraining){
        return GROUP_TRAINING_DAO.update(groupTraining);
    }

    public  static Long deleteById(Long id){
        return GROUP_TRAINING_DAO.deleteById(id);
    }
}
