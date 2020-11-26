package com.java.automation.lab.fall.kapinus.core22.dao.service;

import com.java.automation.lab.fall.kapinus.core22.domain.Subscription;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.SubscriptionDAO;
import com.java.automation.lab.fall.kapinus.core22.dao.impl.SubscriptionDAOImpl;

import java.util.List;

public class SubscriptionService {

    private static final SubscriptionDAO SUBSCRIPTION_DAO = SubscriptionDAOImpl.getInstance();

    public static Subscription createSubscription(Subscription subscription){
        return SUBSCRIPTION_DAO.create(subscription);
    }

    public static Subscription getSubscriptionById(Long id){
        return SUBSCRIPTION_DAO.getById(id);
    }

    public static List<Subscription> get(){
        return SUBSCRIPTION_DAO.get();
    }

    public static Subscription update(Subscription subscription) {
        return SUBSCRIPTION_DAO.update(subscription);
    }

    public static Long deleteById(Long id){
        return SUBSCRIPTION_DAO.deleteById(id);
    }

}
