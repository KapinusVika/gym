package com.java.automation.lab.fall.kapinus.core22.domain.dao.impl;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.PricePlan;
import com.java.automation.lab.fall.kapinus.core22.domain.dao.PricePlanDAO;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.InvalidDiscountException;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.NotImplementetExc;

import java.util.List;

public class PricePlanDAOImpl implements PricePlanDAO {

    private static PricePlanDAOImpl instance;

    public static synchronized PricePlanDAOImpl getInstance() {
        if(instance == null){
            instance = new PricePlanDAOImpl();
        }
        return instance;
    }
    @Override
    public PricePlan create(PricePlan pricePlan) throws InvalidDiscountException {
        return new PricePlan(
                pricePlan.getName(),
                pricePlan.getNameDiscount(),
                pricePlan.getDiscount(),
                pricePlan.getValidity()
        );
    }

    @Override
    public PricePlan getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<PricePlan> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public PricePlan update(PricePlan pricePlan) throws InvalidDiscountException {
        return new PricePlan(
                pricePlan.getName(),
                pricePlan.getNameDiscount(),
                pricePlan.getDiscount(),
                pricePlan.getValidity()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteById");
    }
}
