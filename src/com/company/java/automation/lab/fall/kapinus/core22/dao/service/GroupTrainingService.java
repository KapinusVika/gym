package com.java.automation.lab.fall.kapinus.core22.dao.service;

import com.java.automation.lab.fall.kapinus.core22.domain.GroupTraining;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.GroupTrainingDAO;
import com.java.automation.lab.fall.kapinus.core22.dao.impl.GroupTrainingDAOImpl;

import java.util.List;

public class GroupTrainingService {

    private static final PropertyReader PROPS = PropertyReader.getInstance();
    private static final Map<String, GroupTraining> GROUP_TRAINING_DAOS = Map.of(
            "MOCK", new com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.GroupTrainingDAOImpl(),
            );

    private static final GroupTrainingDAO GROUP_TRAINING_DAO=
            GROUP_TRAINING_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

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
