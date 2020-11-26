package com.java.automation.lab.fall.kapinus.core22.dao.service;

import com.java.automation.lab.fall.kapinus.core22.domain.Client;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.ClientDAO;
import com.java.automation.lab.fall.kapinus.core22.dao.impl.ClientDAOImpl;
import com.java.automation.lab.fall.kapinus.core22.exceptions.AgeClientException;

import java.util.List;

public class ClientService {

    private static final PropertyReader PROPS = PropertyReader.getInstance();
    private static final Map<String, Client> CLIENT_DAOS = Map.of(
            "MOCK", new com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.ClientDAOImpl(),
            );

    private static final ClientDAO CLIENT_DAO =
            CLIENT_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

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
