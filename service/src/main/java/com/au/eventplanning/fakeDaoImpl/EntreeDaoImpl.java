package com.au.eventplanning.fakeDaoImpl;

import com.au.eventplanning.dao.EntreeDao;
import com.au.eventplanning.model.Entree;

import java.util.ArrayList;
import java.util.List;

public class EntreeDaoImpl implements EntreeDao {

    List<Entree> entree = new ArrayList<>();

    @Override
    public int insertEntree(long id, String name, String dietType, List<String> ingredients) {
        return 0;
    }

    @Override
    public List<Entree> getEntree(List<String> dietType) {
        return null;
    }
}
