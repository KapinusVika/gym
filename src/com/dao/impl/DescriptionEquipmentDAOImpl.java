package com.dao.impl;

import com.dao.daoModel.DAO;
import com.domain.DescriptionEquipment;
import com.exceptions.NotImplementetExc;

import java.util.List;

public class DescriptionEquipmentDAOImpl implements DAO<DescriptionEquipment> {

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
