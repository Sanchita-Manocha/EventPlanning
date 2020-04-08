package com.au.eventplanning.fakeDaoImpl;

import com.au.eventplanning.dao.DecorationServicesDao;
import com.au.eventplanning.model.DecorationService;

import java.util.ArrayList;
import java.util.List;

public class DecorationServicesDaoImpl implements DecorationServicesDao {

    List<DecorationService> decorationServices = new ArrayList<>();

    @Override
    public int insertDecorationService(long id, long decorationID, String name, double costAsPerArea) {
        return 0;
    }

    @Override
    public List<DecorationService> getAllDecorationServicesForDecorationId(long id) {
        return null;
    }

    @Override
    public double getDecorationServiceCostAsPerArea(String name) {
        return 0;
    }
}
