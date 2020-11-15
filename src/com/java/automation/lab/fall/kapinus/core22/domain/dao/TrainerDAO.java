package com.java.automation.lab.fall.kapinus.core22.domain.dao;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.Trainer;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.AgeTrainerException;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.InvalidScheduleException;

import java.util.List;

public interface TrainerDAO {
    Trainer create (Trainer trainer) throws AgeTrainerException, InvalidScheduleException;
    Trainer getById(Long id);
    List<Trainer> get();
    Trainer update(Trainer trainer) throws AgeTrainerException, InvalidScheduleException;
    Long deleteById(Long id);
}
