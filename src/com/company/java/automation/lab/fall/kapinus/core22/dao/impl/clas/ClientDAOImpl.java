package com.java.automation.lab.fall.kapinus.core22.dao.impl.clas;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.ClientDAO;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.Client;


import java.util.List;

public class ClientDAOImpl implements DAO<Client> {

    @Override
    public Client create(Client client){
        new ObjectIO<Client>().write(o, IOConstant.RQ_PATH);
        return o;
    }

    @Override
    public Client getById(Long id) {
        return new ObjectIO<Client>().read(IOConstant.RQ_PATH);
    }

    @Override
    public List<Client> get() {
        return null;
    }

    @Override
    public Client update(Client client){
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}
