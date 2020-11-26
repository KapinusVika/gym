package com.java.automation.lab.fall.kapinus.core22.dao.service;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel;

import java.util.Map;

private static final PropertyReader PROPS = PropertyReader.getInstance();

private static final Map<String, AdressDAO> ADRESS_DAOS = Map.of(
        "MOCK", new com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.AdressDAOImpl(),
        "OBJ", new com.java.automation.lab.fall.kapinus.core22.dao.impl.clas.AdressDAOImpl()
        );

private static final Map<String, CardioEquipmentDAO> CARDIO_EQUIPMENT_DAOS = Map.of(
        "MOCK", new com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.CardioEquipmentDAOImpl(),
        "OBJ", new com.java.automation.lab.fall.kapinus.core22.dao.impl.clas.CardioEquipmentDAOImpl()
        );

private static final Map<String, ClientDAO> CLIENT_DAOS = Map.of(
        "MOCK", new com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.ClientDAOImpl(),
        "OBJ", new com.java.automation.lab.fall.kapinus.core22.dao.impl.clas.ClientDAOImpl()
        );

private static final Map<String, ContactDAO> CONTACT_DAOS = Map.of(
        "MOCK", new com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.ContactDAOImpl(),
        "OBJ", new com.java.automation.lab.fall.kapinus.core22.dao.impl.clas.ContactDAOImpl()
        );

private static final Map<String, DescriptionEquipmenDAO> DESCRIPTION_EQUIPMENT_DAOS = Map.of(
        "MOCK", new com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.DescriptionEquipmentDAOImpl(),
        "OBJ", new com.java.automation.lab.fall.kapinus.core22.dao.impl.clas.DescriptionEquipmentDAOImpl()
        );

private static final Map<String, GroupTrainingDAO> GROUP_TRAINING_DAOS = Map.of(
        "MOCK", new com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.GroupTrainingDAOImpl(),
        "OBJ", new com.java.automation.lab.fall.kapinus.core22.dao.impl.clas.GroupTrainingDAOImpl()
        );

private static final Map<String, NutritionFactsDAO> NUTRITION_FACTS_DAOS = Map.of(
        "MOCK", new com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.NutritionFactsDAOImpl(),
        "OBJ", new com.java.automation.lab.fall.kapinus.core22.dao.impl.clas.NutritionFactsDAOImpl()
        );

private static final Map<String, NutritionProgramDAO> NUTRITION_PROGRAM_DAOS = Map.of(
        "MOCK", new com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.NutritionProgramDAOImpl(),
        "OBJ", new com.java.automation.lab.fall.kapinus.core22.dao.impl.clas.NutritionProgramDAOImpl()
        );

private static final Map<String, PowerEquipmentDAO> POWER_EQUIPMENT_DAOS = Map.of(
        "MOCK", new com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.PowerEquipmentDAOImpl(),
        "OBJ", new com.java.automation.lab.fall.kapinus.core22.dao.impl.clas.PowerEquipmentDAOImpl()
        );

private static final Map<String, PricePlanDAO> PRICE_PLAN_DAOS = Map.of(
        "MOCK", new com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.PricePlanDAOImpl(),
        "OBJ", new com.java.automation.lab.fall.kapinus.core22.dao.impl.clas.PricePlanDAOImpl()
        );

private static final Map<String, SubscriptionDAO> SUBSCRIPTION_DAOS = Map.of(
        "MOCK", new com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.SubscriptionDAOImpl(),
        "OBJ", new com.java.automation.lab.fall.kapinus.core22.dao.impl.clas.SubscriptionDAOImpl()
        );

private static final Map<String, TrainerDAO> TRAINER_DAOS = Map.of(
        "MOCK", new com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.TrainerDAOImpl(),
        "OBJ", new com.java.automation.lab.fall.kapinus.core22.dao.impl.clas.TrainerDAOImpl()
        );

private static final Map<String, TrainingProgramDAO> TRAINING_PROGRAM_DAOS = Map.of(
        "MOCK", new com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.TrainingProgramDAOImpl(),
        "OBJ", new com.java.automation.lab.fall.kapinus.core22.dao.impl.clas.TrainingProgramDAOImpl()
        );

private static final Map<String, TrainingDAO> TRAINING_DAOS = Map.of(
        "MOCK", new com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.TrainingDAOImpl(),
        "OBJ", new com.java.automation.lab.fall.kapinus.core22.dao.impl.clas.TrainingDAOImpl()
        );