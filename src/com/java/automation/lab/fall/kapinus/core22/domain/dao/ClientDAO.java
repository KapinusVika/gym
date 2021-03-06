package com.java.automation.lab.fall.kapinus.core22.domain.dao;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.Client;
import com.java.automation.lab.fall.kapinus.core22.domain.exceptions.AgeClientException;

import java.util.List;

public interface ClientDAO{
    Client create (Client client) throws AgeClientException;
    Client getById(Long id);
    List<Client> get();
    Client update(Client client) throws AgeClientException;
    Long deleteById(Long id);
}

