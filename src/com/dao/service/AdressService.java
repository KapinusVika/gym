package com.dao.service;

import com.domain.Adress;
import com.dao.daoModel.AdressDAO;
import com.dao.impl.AdressDAOImpl;

import java.util.List;

public class AdressService {

    private static final AdressDAO ADRESS_DAO = AdressDAOImpl.getInstance();

    public static Adress createAdress(Adress adress){
        return ADRESS_DAO.create(adress);
    }

    public static Adress getAdressById(Long id){
        return ADRESS_DAO.getById(id);
    }

    public static List<Adress> get(){
        return ADRESS_DAO.get();
    }

    public static Adress update(Adress adress){
        return ADRESS_DAO.update(adress);
    }

    public  static Long deleteById(Long id){
        return ADRESS_DAO.deleteById(id);
    }
}
