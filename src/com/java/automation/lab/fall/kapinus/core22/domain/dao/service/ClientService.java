package com.java.automation.lab.fall.kapinus.core22.domain.dao.service;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.Client;
import com.java.automation.lab.fall.kapinus.core22.domain.dao.ClientDAO;
import com.java.automation.lab.fall.kapinus.core22.domain.dao.impl.ClientDAOImpl;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.AgeClientException;

import java.util.List;

public class ClientService {
    private static final ClientDAO CLIENT_DAO = ClientDAOImpl.getInstance();

    public static Client createClient(Client client) throws AgeClientException {
        return CLIENT_DAO.create(client);
    }

    public static Client getClientById(Long id){
        return CLIENT_DAO.getById(id);
    }

    public static List<Client> get(){
        return CLIENT_DAO.get();
    }

    public static Client update(Client client) throws AgeClientException {
        return CLIENT_DAO.update(client);
    }

    public  static Long deleteById(Long id){
        return CLIENT_DAO.deleteById(id);
    }

}
