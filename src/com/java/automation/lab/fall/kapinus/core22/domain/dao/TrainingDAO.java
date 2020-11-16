package com.java.automation.lab.fall.kapinus.core22.domain.dao;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.Training;

import java.util.List;

public interface TrainingDAO {
    Training create (Training training);
    Training getById(Long id);
    List<Training> get();
    Training update(Training training);
    Long deleteById(Long id);
}
