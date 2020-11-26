package com.java.automation.lab.fall.kapinus.core22.dao.service;


import com.java.automation.lab.fall.kapinus.core22.domain.DescriptionEquipment;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DescriptionEquipmentDAO;
import com.java.automation.lab.fall.kapinus.core22.dao.impl.DescriptionEquipmentDAOImpl;

import java.util.List;

public class DescriptionEquipmentService {

    private static final DescriptionEquipmentDAO DESCRIPTION_EQUIPMENT_DAO = DescriptionEquipmentDAOImpl.getInstance();

    public static DescriptionEquipment createDescriptionEquipment(DescriptionEquipment descriptionEquipment){
        return DESCRIPTION_EQUIPMENT_DAO.create(descriptionEquipment);
    }

    public static DescriptionEquipment getDescriptionEquipmentsById(Long id){
        return DESCRIPTION_EQUIPMENT_DAO.getById(id);
    }

    public static List<DescriptionEquipment> get(){
        return DESCRIPTION_EQUIPMENT_DAO.get();
    }

    public static DescriptionEquipment update(DescriptionEquipment descriptionEquipment){
        return DESCRIPTION_EQUIPMENT_DAO.update(descriptionEquipment);
    }

    public  static Long deleteById(Long id){
        return DESCRIPTION_EQUIPMENT_DAO.deleteById(id);
    }
}
