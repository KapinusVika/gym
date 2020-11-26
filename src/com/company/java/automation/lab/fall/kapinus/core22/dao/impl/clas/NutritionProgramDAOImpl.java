package com.java.automation.lab.fall.kapinus.core22.dao.impl.clas;

import com.java.automation.lab.fall.kapinus.core22.dao.daoModel.DAO;
import com.java.automation.lab.fall.kapinus.core22.domain.NutritionProgram;

import java.util.List;

public class NutritionProgramDAOImpl implements DAO<NutritionProgram> {

    @Override
    public NutritionFacts create(NutritionFacts o) {
        new ObjectIO<NutritionFacts>().write(o, IOConstant.RQ_PATH);
        return o;
    }

    @Override
    public NutritionFacts getById(Long id) {
        return new ObjectIO<NutritionFacts>().read(IOConstant.RQ_PATH);

    }

    @Override
    public List<NutritionFacts> get() {
        return null;
    }

    @Override
    public NutritionFacts update(NutritionFacts o) {
        return null;
    }

    @Override
    public Long deleteById(Long id) {
        return null;
    }
}