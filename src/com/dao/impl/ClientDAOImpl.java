package com.dao.impl;

import com.dao.daoModel.ClientDAO;
import com.dao.daoModel.DAO;
import com.domain.Client;
import com.exceptions.AgeClientException;
import com.exceptions.NotImplementetExc;

import java.util.List;

public class ClientDAOImpl implements ClientDAO {

    private static ClientDAOImpl instance;

    public static synchronized ClientDAOImpl getInstance() {
        if(instance == null){
            instance = new ClientDAOImpl();
        }
        return instance;
    }

    private ClientDAOImpl(){

    }

    @Override
    public Client create(Client client) throws AgeClientException {
        return new Client(
                client.getName(),
                client.getAge(),
                client.getAgeGroups(),
                client.getSubscription(),
                client.getNutritionProgram(),
                client.getTrainingProgram());
    }

    @Override
    public Client getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<Client> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public Client update(Client client) throws AgeClientException {
        return new Client(
                client.getName(),
                client.getAge(),
                client.getAgeGroups(),
                client.getSubscription(),
                client.getNutritionProgram(),
                client.getTrainingProgram());
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }
}
