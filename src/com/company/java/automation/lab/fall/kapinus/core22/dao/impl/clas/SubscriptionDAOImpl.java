package com.java.automation.lab.fall.kapinus.core22.dao.impl.clas;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Subscription;

import java.util.List;

public class SubscriptionDAOImpl implements DAO<Subscription> {

    @Override
    public Subscription create(Subscription o) {
        new ObjectIO<Subscription>().write(o, IOConstant.RQ_PATH);
        return o;
    }

    @Override
    public Subscription getById(Long id) {
        return new ObjectIO<Subscription>().read(IOConstant.RQ_PATH);

    }

    @Override
    public List<Subscription> get() {
        return null;
    }

    @Override
    public Subscription update(Subscription o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}