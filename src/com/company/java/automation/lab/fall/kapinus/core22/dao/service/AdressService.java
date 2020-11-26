package com.java.automation.lab.fall.kapinus.core22.dao.service;

import com.java.automation.lab.fall.kapinus.core22.domain.Adress;
import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.AdressDAO;
import com.java.automation.lab.fall.kapinus.core22.dao.impl.AdressDAOImpl;

import java.util.List;

public class AdressService {

    private static final PropertyReader PROPS = PropertyReader.getInstance();
    private static final Map<String, AdressDAO> ADRESS_DAOS = Map.of(
            "MOCK", new com.java.automation.lab.fall.kapinus.core22.dao.impl.mock.AdressDAOImpl(),
    );

    private static final AdressDAO ADRESS_DAO = ADRESS_DAOS.get(PROPS.getValue(PropertyConstant.ENV_KEY));

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
