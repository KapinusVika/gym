package com.dao.daoModel;

import com.domain.Trainer;
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
