package com.dao.daoModel;

import com.domain.Client;
import com.exceptions.AgeClientException;

import java.util.List;

public interface ClientDAO{
        Client create (Client client) throws AgeClientException;
        Client getById(Long id);
        List<Client> get();
        Client update(Client client) throws AgeClientException;
        Long deleteById(Long id);
    }

