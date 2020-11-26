package com.dao.impl;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.Adress;
import com.dao.daoAll.AdressDAO;
import com.exceptions.NotImplementetExc;

import java.util.List;

public class AdressDAOImpl implements AdressDAO {

    private static AdressDAOImpl instance;

    public static synchronized AdressDAOImpl getInstance() {
        if(instance == null){
            instance = new AdressDAOImpl();
        }
        return instance;
    }

    @Override
    public Adress create(Adress adress) {
        return new Adress(
                adress.getCity(),
                adress.getStreet(),
                adress.getBuild(),
                adress.getApt()
        );
    }

    @Override
    public Adress getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<Adress> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public Adress update(Adress adress) {
        return new Adress(
                adress.getCity(),
                adress.getStreet(),
                adress.getBuild(),
                adress.getApt()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteById");
    }
}
