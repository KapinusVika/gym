package com.dao.daoAll;


import com.java.automation.lab.fall.kapinus.core22.domain.classes.GroupTraining;

import java.util.List;

public interface GroupTrainingDAO {
    GroupTraining create (GroupTraining groupTraining);
    GroupTraining getById(Long id);
    List<GroupTraining> get();
    GroupTraining update(GroupTraining groupTraining);
    Long deleteById(Long id);
}
