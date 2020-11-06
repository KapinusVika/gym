package com.java.automation.lab.fall.kapinus.core22.domain.factory;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.CardioEquipment;
import com.java.automation.lab.fall.kapinus.core22.domain.classes.Equipment;
import com.java.automation.lab.fall.kapinus.core22.domain.classes.PowerEquipment;
import com.java.automation.lab.fall.kapinus.core22.domain.enums.EquipmentsType;

import java.util.Map;

public class GenericFactoryEquipment {
    private static final Map<EquipmentsType, Factory<? extends Equipment>> types = Map.of(
            EquipmentsType.CARDIO, new Factory(CardioEquipment.class),
            EquipmentsType.POWER, new Factory(PowerEquipment.class)
    );

    public static Equipment createEquipment(EquipmentsType equipmentsType, String name, int weight){
        return types.get(equipmentsType).getInstance().setName(name);
    }
}
