package com.au.eventplanning.dao;

import com.au.eventplanning.model.Occasion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface OccasionDao {

    int insertOccasion(long id,String name);
    List<Occasion> getOccasions();
    int editOccasion(long id, String name);
}
