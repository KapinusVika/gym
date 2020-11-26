package com.dao.daoAll;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.DescriptionEquipment;

import java.util.List;

public interface DescriptionEquipmentDAO {
    DescriptionEquipment create (DescriptionEquipment descriptionEquipment);
    DescriptionEquipment getById(Long id);
    List<DescriptionEquipment> get();
    DescriptionEquipment update(DescriptionEquipment descriptionEquipment);
    Long deleteById(Long id);
}
