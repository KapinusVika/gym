package com.dao.daoAll;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.Subscription;

import java.util.List;

public interface SubscriptionDAO {
    Subscription create (Subscription subscription);
    Subscription getById(Long id);
    List<Subscription> get();
    Subscription update(Subscription subscription);
    Long deleteById(Long id);
}
