package com.java.automation.lab.fall.kapinus.core22.domain.dao.impl;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.DescriptionEquipment;
import com.java.automation.lab.fall.kapinus.core22.domain.dao.DescriptionEquipmentDAO;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.NotImplementetExc;

import java.util.List;

public class DescriptionEquipmentDAOImpl implements DescriptionEquipmentDAO {

    private static DescriptionEquipmentDAOImpl instance;

    public static synchronized DescriptionEquipmentDAOImpl getInstance() {
        if(instance == null){
            instance = new DescriptionEquipmentDAOImpl();
        }
        return instance;
    }


    @Override
    public DescriptionEquipment create(DescriptionEquipment descriptionEquipment) {
        return new DescriptionEquipment(
                descriptionEquipment.getName(),
                descriptionEquipment.getWeight(),
                descriptionEquipment.getMadeIn(),
                descriptionEquipment.getYear()
        );
    }

    @Override
    public DescriptionEquipment getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<DescriptionEquipment> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public DescriptionEquipment update(DescriptionEquipment descriptionEquipment) {
        return new DescriptionEquipment(
                descriptionEquipment.getName(),
                descriptionEquipment.getWeight(),
                descriptionEquipment.getMadeIn(),
                descriptionEquipment.getYear()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteById");
    }
}
