package com.dao.impl;

import com.dao.daoModel.DAO;
import com.domain.Subscription;
import com.exceptions.NotImplementetExc;

import java.util.List;

public class SubscriptionDAOImpl implements DAO<Subscription> {

    private static SubscriptionDAOImpl instance;

    public static synchronized SubscriptionDAOImpl getInstance() {
        if(instance == null){
            instance = new SubscriptionDAOImpl();
        }
        return instance;
    }

    @Override
    public Subscription create(Subscription subscription) {
        return new Subscription(
                subscription.getName(),
                subscription.getAdress(),
                subscription.getContact(),
                subscription.getSchedule(),
                subscription.getOpeningHours(),
                subscription.getPricePlan(),
                subscription.getTraining()
        );
    }

    @Override
    public Subscription getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<Subscription> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public Subscription update(Subscription subscription) {
        return new Subscription(
                subscription.getName(),
                subscription.getAdress(),
                subscription.getContact(),
                subscription.getSchedule(),
                subscription.getOpeningHours(),
                subscription.getPricePlan(),
                subscription.getTraining()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteById");
    }
}
