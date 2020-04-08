package com.au.eventplanning.dao;

import com.au.eventplanning.model.Catering;
import java.util.List;

public interface CateringDao {

    int insertCatering(long id, long venueId, String name, String budgetType);
    List<Catering> getCateringOptions(long venueId, String budgetType);
}
