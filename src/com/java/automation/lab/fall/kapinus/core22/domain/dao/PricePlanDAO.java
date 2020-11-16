package com.java.automation.lab.fall.kapinus.core22.domain.dao;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.PricePlan;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.InvalidDiscountException;

import java.util.List;

public interface PricePlanDAO {
    PricePlan create (PricePlan pricePlan) throws InvalidDiscountException;
    PricePlan getById(Long id);
    List<PricePlan> get();
    PricePlan update(PricePlan pricePlan) throws InvalidDiscountException;
    Long deleteById(Long id);
}
