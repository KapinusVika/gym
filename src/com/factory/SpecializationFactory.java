package com.factory;

import com.domain.Trainer;
import com.enums.TrainerSpecialization;
import com.exceptions.AgeTrainerException;
import com.exceptions.InvalidScheduleException;

public class SpecializationFactory {
    public static Trainer createTrainerGym
            (String name, int age, int [][] schedule) throws AgeTrainerException, InvalidScheduleException {
        return new Trainer(name, age, TrainerSpecialization.GYM, schedule);
    }

    public static Trainer createTrainerBoxing
            (String name, int age, int [][] schedule) throws AgeTrainerException, InvalidScheduleException {
        return new Trainer(name, age, TrainerSpecialization.BOXING, schedule);
    }

    public static Trainer createTrainerFitness
            (String name, int age, int [][] schedule) throws AgeTrainerException, InvalidScheduleException {
        return new Trainer(name, age, TrainerSpecialization.FITNESS, schedule);
    }

    public static Trainer createTrainerStretching
            (String name, int age, int [][] schedule) throws AgeTrainerException, InvalidScheduleException {
        return new Trainer(name, age, TrainerSpecialization.STRETCHING, schedule);
    }

    public static Trainer createTrainerZumba
            (String name, int age, int [][] schedule) throws AgeTrainerException, InvalidScheduleException {
        return new Trainer(name, age, TrainerSpecialization.ZUMBA, schedule);
    }

    public static Trainer createTrainerYoga
            (String name, int age, int [][] schedule) throws AgeTrainerException, InvalidScheduleException {
        return new Trainer(name, age, TrainerSpecialization.YOGA, schedule);
    }

}
