package com.dao.daoAll;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.Trainer;
import com.exceptions.AgeTrainerException;
import com.exceptions.InvalidScheduleException;

import java.util.List;

public interface TrainerDAO {
    Trainer create (Trainer trainer) throws AgeTrainerException, InvalidScheduleException;
    Trainer getById(Long id);
    List<Trainer> get();
    Trainer update(Trainer trainer) throws AgeTrainerException, InvalidScheduleException;
    Long deleteById(Long id);
}
