package com.java.automation.lab.fall.kapinus.core22.domain.dao.impl;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.CardioEquipment;
import com.java.automation.lab.fall.kapinus.core22.domain.dao.CardioEquipmentDAO;
import com.java.automation.lab.fall.kapinus.core22.domain.dao.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.NotImplementetExc;

import java.util.List;

public class CardioEquipmentDAOImpl implements CardioEquipmentDAO {

    private static CardioEquipmentDAOImpl instance;

    public static synchronized CardioEquipmentDAOImpl getInstance() {
        if(instance == null){
            instance = new CardioEquipmentDAOImpl();
        }
        return instance;
    }

    @Override
    public CardioEquipment create(CardioEquipment o) {
        return new CardioEquipment(
                o.getDescriptionEquipment(),
                o.getMaxWeight()
        );
    }

    @Override
    public CardioEquipment getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<CardioEquipment> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public CardioEquipment update(CardioEquipment o) {
        return new CardioEquipment(
                o.getDescriptionEquipment(),
                o.getMaxWeight()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteById");
    }
}
