package com.java.automation.lab.fall.kapinus.core22.dao.impl.clas;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Adress;

import java.util.List;

public class AdressDAOImplClas implements DAO<Adress> {

    @Override
    public Adress create(Adress o) {
        new ObjectIO<Adress>().write(o, IOConstant.RQ_PATH);
        return o;

    }

    @Override
    public Adress getById(Long id) {
        return new ObjectIO<Client>().read(IOConstant.RQ_PATH);
    }

    @Override
    public List<Adress> get() {
        return null
    }

    @Override
    public Adress update(Adress o) {
        return null

    }

    @Override
    public Long deleteById(Long id) {
        return null
    }
}
