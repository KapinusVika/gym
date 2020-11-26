package com.dao.service;

import com.domain.PricePlan;
import com.dao.daoModel.PricePlanDAO;
import com.dao.impl.PricePlanDAOImpl;
import com.exceptions.InvalidDiscountException;

import java.util.List;

public class PricePlanService {

    private static final PricePlanDAO PRICE_PLAN_DAO = PricePlanDAOImpl.getInstance();

    public static PricePlan createPricePlan(PricePlan pricePlan) throws InvalidDiscountException {
        return PRICE_PLAN_DAO.create(pricePlan);
    }

    public static PricePlan getPricePlanById(Long id){
        return PRICE_PLAN_DAO.getById(id);
    }

    public static List<PricePlan> get(){
        return PRICE_PLAN_DAO.get();
    }

    public static PricePlan update(PricePlan pricePlan) throws InvalidDiscountException {
        return PRICE_PLAN_DAO.update(pricePlan);
    }

    public  static Long deleteById(Long id){
        return PRICE_PLAN_DAO.deleteById(id);
    }
}
