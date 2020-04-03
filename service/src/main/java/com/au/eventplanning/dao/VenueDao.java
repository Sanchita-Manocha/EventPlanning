package com.au.eventplanning.dao;

import com.au.eventplanning.model.Venue;

import java.util.List;

public interface VenueDao {

    int insertVenue(long id,long occasionId, String name, String budgetType, String location, int areaSize);
    List<Venue> getVenues(long occasionId, String budgetType, String location );
}
