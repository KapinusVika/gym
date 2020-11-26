package com.dao.impl;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.Contact;
import com.dao.daoAll.ContactDAO;
import com.exceptions.NotImplementetExc;

import java.util.List;

public class ContactDAOImpl implements ContactDAO {

    private static ContactDAOImpl instance;

    public static synchronized ContactDAOImpl getInstance() {
        if(instance == null){
            instance = new ContactDAOImpl();
        }
        return instance;
    }

    @Override
    public Contact create(Contact contact) {
        return new Contact(
                contact.getPhoneNumber(),
                contact.getInstagramAcc()
        );
    }

    @Override
    public Contact getById(Long id) {
        throw new NotImplementetExc("Method not implemented getById");
    }

    @Override
    public List<Contact> get() {
        throw new NotImplementetExc("Method not implemented get");
    }

    @Override
    public Contact update(Contact contact) {
        return new Contact(
                contact.getPhoneNumber(),
                contact.getInstagramAcc()
        );
    }

    @Override
    public Long deleteById(Long id) {
        throw new NotImplementetExc("Method not implemented deleteById");
    }
}
