package com.au.eventplanning.fakeDaoImpl;

import com.au.eventplanning.dao.VenueDao;
import com.au.eventplanning.model.Venue;

import java.util.List;
import java.util.stream.Collectors;

public class VenueDaoImpl implements VenueDao {

    List<Venue> venues;
    @Override
    public int insertVenue(long id, long occasionId, String name, String budgetType, String location, int areaSize) {
        return 0;
    }

    @Override
    public List<Venue> getVenues(long occasionId, String budgetType, String location) {

        return venues.stream().filter(venue -> venue.getOccasionId() == occasionId &&
                                                venue.getBudgetType().equalsIgnoreCase(budgetType) &&
                                                venue.getLocation().equalsIgnoreCase(location))
                                                .collect(Collectors.toList());
    }
}
