package com.dao.service;

import com.domain.Client;
import com.dao.daoModel.ClientDAO;
import com.dao.impl.ClientDAOImpl;
import com.exceptions.AgeClientException;

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
