package com.java.automation.lab.fall.kapinus.core22.dao.impl.clas;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.CardioEquipment;

import java.util.List;

public class CardioEquipmentDAOImpl implements DAO<CardioEquipment> {

    @Override
    public CardioEquipment create(CardioEquipment o) {
        new ObjectIO<CardioEquipment>().write(o, IOConstant.RQ_PATH);
        return o;
    }

    @Override
    public CardioEquipment getById(Long id) {
        return new ObjectIO<CardioEquipment>().read(IOConstant.RQ_PATH);

    }

    @Override
    public List<CardioEquipment> get() {
        return null;
    }

    @Override
    public CardioEquipment update(CardioEquipment o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
