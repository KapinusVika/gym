package com.dao.daoAll;

import com.java.automation.lab.fall.kapinus.core22.domain.classes.Contact;

import java.util.List;

public interface ContactDAO {
    Contact create (Contact contact);
    Contact getById(Long id);
    List<Contact> get();
    Contact update(Contact contact);
    Long deleteById(Long id);
}
