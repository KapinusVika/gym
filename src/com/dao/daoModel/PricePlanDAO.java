package com.dao.daoModel;

import com.domain.PricePlan;
import com.exceptions.InvalidDiscountException;

import java.util.List;

public interface PricePlanDAO {
    PricePlan create (PricePlan pricePlan) throws InvalidDiscountException;
    PricePlan getById(Long id);
    List<PricePlan> get();
    PricePlan update(PricePlan pricePlan) throws InvalidDiscountException;
    Long deleteById(Long id);
}
