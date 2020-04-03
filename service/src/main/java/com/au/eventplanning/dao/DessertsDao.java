package com.au.eventplanning.dao;

import com.au.eventplanning.model.Dessert;

import java.util.List;

public interface DessertsDao {

    int insertDessert(long id, String name, String dietType, List<String> ingredients);
    List<Dessert> getDesserts(List<String> dietType);

}
