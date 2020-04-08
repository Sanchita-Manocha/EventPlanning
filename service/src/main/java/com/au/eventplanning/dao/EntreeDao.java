package com.au.eventplanning.dao;

import com.au.eventplanning.model.Entree;
import com.au.eventplanning.model.Occasion;

import java.util.ArrayList;
import java.util.List;

public interface EntreeDao {

    int insertEntree(long id, String name, String dietType, List<String> ingredients);
    List<Entree> getEntree(List<String> dietType);

}
