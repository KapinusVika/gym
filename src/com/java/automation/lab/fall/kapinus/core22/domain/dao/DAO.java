package com.java.automation.lab.fall.kapinus.core22.domain.dao;



import com.java.automation.lab.fall.kapinus.core22.domain.classes.Equipment;

import java.util.List;

public interface DAO<T extends Equipment> {
    T create (T o);
    T getById(Long id);
    List<T> get();
    T update(T o);
    Long deleteById(Long id);
}
