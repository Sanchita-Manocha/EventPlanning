package com.au.eventplanning.fakeDaoImpl;

import com.au.eventplanning.dao.CateringDao;
import com.au.eventplanning.model.Catering;

import java.util.ArrayList;
import java.util.List;

public class CateringDaoImpl implements CateringDao {
    List<Catering> catering = new ArrayList<>();

    @Override
    public int insertCatering(long id, long venueId, String name, String budgetType) {
        return 0;
    }

    @Override
    public List<Catering> getCateringOptions(long venueId, String budgetType) {
        return null;
    }
}
