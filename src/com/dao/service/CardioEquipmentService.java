package com.dao.service;

import com.domain.CardioEquipment;
import com.dao.daoModel.CardioEquipmentDAO;
import com.dao.impl.CardioEquipmentDAOImpl;

import java.util.List;

public class CardioEquipmentService {
    private static final CardioEquipmentDAO CARDIO_EQUIPMENT_DAO = CardioEquipmentDAOImpl.getInstance();

    public static CardioEquipment createCardioEquipment(CardioEquipment cardioEquipment){
        return CARDIO_EQUIPMENT_DAO.create(cardioEquipment);
    }

    public static CardioEquipment getCardioEquipmentById(Long id){
        return CARDIO_EQUIPMENT_DAO.getById(id);
    }

    public static List<CardioEquipment> get(){
        return CARDIO_EQUIPMENT_DAO.get();
    }

    public static CardioEquipment update(CardioEquipment cardioEquipment){
        return CARDIO_EQUIPMENT_DAO.update(cardioEquipment);
    }

    public  static Long deleteById(Long id){
        return CARDIO_EQUIPMENT_DAO.deleteById(id);
    }
}
