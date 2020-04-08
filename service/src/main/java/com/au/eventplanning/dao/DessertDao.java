package com.au.eventplanning.dao;

import com.au.eventplanning.model.Dessert;
import com.au.eventplanning.model.Occasion;

import java.util.ArrayList;
import java.util.List;

public interface DessertDao {

    int insertDessert(long id, String name, String dietType, List<String> ingredients);
    List<Dessert> getDesserts(List<String> dietType);

}
