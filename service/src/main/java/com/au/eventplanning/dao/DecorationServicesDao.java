package com.au.eventplanning.dao;

import com.au.eventplanning.model.DecorationService;

import java.util.List;

public interface DecorationServicesDao {

    int insertDecorationService(long id, long decorationID, String name, double costAsPerArea);
    List<DecorationService> getAllDecorationServicesForDecorationId(long id);
    double getDecorationServiceCostAsPerArea(String name);
}
