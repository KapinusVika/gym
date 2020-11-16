package com.java.automation.lab.fall.kapinus.core22.domain.dao;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.Adress;


import java.util.List;

public interface AdressDAO {
    Adress create (Adress adress);
    Adress getById(Long id);
    List<Adress> get();
    Adress update(Adress adress);
    Long deleteById(Long id);
}
