package com.factory;

import com.domain.CardioEquipment;
import com.domain.DescriptionEquipment;
import com.domain.Equipment;
import com.domain.PowerEquipment;
import com.enums.EquipmentsType;

import java.util.Map;

public class FactoryEquipment {
    private static final Map<EquipmentsType, Factory<? extends Equipment>> types = Map.of(
            EquipmentsType.CARDIO, new Factory(CardioEquipment.class),
            EquipmentsType.POWER, new Factory(PowerEquipment.class));

    public static Equipment createEquipment(EquipmentsType equipmentsType, DescriptionEquipment descriptionEquipment){
        return types.get(equipmentsType).getInstance().setDescriptionEquipment(descriptionEquipment);

    }
}
