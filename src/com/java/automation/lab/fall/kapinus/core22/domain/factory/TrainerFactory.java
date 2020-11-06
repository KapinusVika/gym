package com.java.automation.lab.fall.kapinus.core22.domain.factory;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.Trainer;
import com.java.automation.lab.fall.kapinus.core22.domain.enums.TrainerSpecialization;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.AgeTrainerException;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.InvalidScheduleException;

public class TrainerFactory {
    public static <T extends Trainer> T createTrainer(
            String name, int age, TrainerSpecialization trainerSpecialization, int [][] schedule)
            throws AgeTrainerException, InvalidScheduleException {
        T trainer = (T) new Trainer(name, age, trainerSpecialization, schedule);
        return trainer;
    }
}
