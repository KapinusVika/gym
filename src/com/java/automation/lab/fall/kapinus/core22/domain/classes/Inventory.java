package com.java.automation.lab.fall.kapinus.core22.domain.classes;

import java.util.HashMap;

public class Inventory {
    HashMap listCardioEq = new HashMap();
    HashMap listPowerEq = new HashMap();

    public void addListCardioEq(int inventoryNum, CardioEquipment cardioEquipment){
        listCardioEq.put(inventoryNum, cardioEquipment);
    }

    public void removeListCardioEq(int inventoryNum, CardioEquipment cardioEquipment){
        listCardioEq.remove(cardioEquipment, inventoryNum);
    }
    public void addListPowerEq(int inventoryNum, PowerEquipment powerEquipment){
        listPowerEq.put(inventoryNum, powerEquipment);
    }

    public void removeListPowerEq(int inventoryNum, PowerEquipment powerEquipment){
        listPowerEq.remove(powerEquipment, inventoryNum);
    }
}
