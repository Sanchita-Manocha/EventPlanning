package com.au.eventplanning.fakeDaoImpl;

import com.au.eventplanning.dao.DessertDao;
import com.au.eventplanning.model.Dessert;

import java.util.ArrayList;
import java.util.List;

public class DessertDaoImpl implements DessertDao {

    List<Dessert> occasions = new ArrayList<>();

    @Override
    public int insertDessert(long id, String name, String dietType, List<String> ingredients) {
        return 0;
    }

    @Override
    public List<Dessert> getDesserts(List<String> dietType) {
        return null;
    }
}
