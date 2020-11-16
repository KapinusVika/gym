package com.java.automation.lab.fall.kapinus.core22.domain.dao;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.TrainingProgram;

import java.util.List;

public interface TrainingProgramDAO {
    f
    TrainingProgram create (TrainingProgram trainingProgram);
    TrainingProgram getById(Long id);
    List<TrainingProgram> get();
    TrainingProgram update(TrainingProgram trainingProgram);
    Long deleteById(Long id);
}
