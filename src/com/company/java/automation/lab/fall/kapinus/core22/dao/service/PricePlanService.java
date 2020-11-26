package com.java.automation.lab.fall.kapinus.core22.dao.service;

import com.java.automation.lab.fall.kapinus.core22.domain.PricePlan;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.PricePlanDAO;
import com.java.automation.lab.fall.kapinus.core22.dao.impl.PricePlanDAOImpl;
import com.java.automation.lab.fall.kapinus.core22.exceptions.InvalidDiscountException;

import java.util.List;

public class PricePlanService {

    private static final PricePlanDAO PRICE_PLAN_DAO =
            PRICE_PLAN_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

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
