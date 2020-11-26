package com.java.automation.lab.fall.kapinus.core22.dao.service;

import com.java.automation.lab.fall.kapinus.core22.domain.Contact;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.ContactDAO;
import com.java.automation.lab.fall.kapinus.core22.dao.impl.ContactDAOImpl;

import java.util.List;

public class ContactService {

    private static final ContactDAO CONTACT_DAO = ContactDAOImpl.getInstance();

    public static Contact createContact(Contact contact){
        return CONTACT_DAO.create(contact);
    }

    public static Contact getContactById(Long id){
        return CONTACT_DAO.getById(id);
    }

    public static List<Contact> get(){
        return CONTACT_DAO.get();
    }

    public static Contact update(Contact contact){
        return CONTACT_DAO.update(contact);
    }

    public  static Long deleteById(Long id){
        return CONTACT_DAO.deleteById(id);
    }
}
