package com.dao.service;

import com.domain.PowerEquipment;
import com.dao.daoModel.PowerEquipmentDAO;
import com.dao.impl.PowerEquipmentDAOImpl;

import java.util.List;

public class PowerEquipmentService {
    private static final PowerEquipmentDAO POWER_EQUIPMENT_DAO = PowerEquipmentDAOImpl.getInstance();

    public static PowerEquipment createPowerEquipment(PowerEquipment powerEquipment){
        return POWER_EQUIPMENT_DAO.create(powerEquipment);
    }

    public static PowerEquipment getPowerEquipmentById(Long id){
        return POWER_EQUIPMENT_DAO.getById(id);
    }

    public static List<PowerEquipment> get(){
        return POWER_EQUIPMENT_DAO.get();
    }

    public static PowerEquipment update(PowerEquipment powerEquipment){
        return POWER_EQUIPMENT_DAO.update(powerEquipment);
    }

    public  static Long deleteById(Long id){
        return POWER_EQUIPMENT_DAO.deleteById(id);
    }
}
