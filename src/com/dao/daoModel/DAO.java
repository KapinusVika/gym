package com.dao.daoModel;

import java.util.List;

public interface DAO <T>{
        T create (T o);
        T getById(Long id);
        List<T> get();
        T update(T o);
        Long deleteById(Long id);
    }
