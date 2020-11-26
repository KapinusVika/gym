package com.java.automation.lab.fall.kapinus.core22.dao.impl.clas;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.DescriptionEquipment;

import java.util.List;

public class DescriptionEquipmentDAOImpl implements DAO<DescriptionEquipment> {

    @Override
    public DescriptionEquipment create(DescriptionEquipment o) {
        new ObjectIO<DescriptionEquipment>().write(o, IOConstant.RQ_PATH);
        return o;
    }

    @Override
    public DescriptionEquipment getById(Long id) {
        return new ObjectIO<DescriptionEquipment>().read(IOConstant.RQ_PATH);

    }

    @Override
    public List<DescriptionEquipment> get() {
        return null;
    }

    @Override
    public DescriptionEquipment update(DescriptionEquipment o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}