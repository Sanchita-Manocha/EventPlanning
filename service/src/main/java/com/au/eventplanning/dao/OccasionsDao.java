package com.au.eventplanning.dao;

import com.au.eventplanning.model.Occasion;
import com.au.eventplanning.model.Venue;

import java.util.List;

public interface OccasionsDao {

    int insertOccasion(long id, List<Venue> venues);
    List<Occasion> getOccasions(long id);
}
