package com.dao.impl;

import com.dao.daoModel.PricePlanDAO;
import com.domain.PricePlan;
import com.exceptions.InvalidDiscountException;
import com.exceptions.NotImplementetExc;

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
