package com.au.eventplanning.dao;

import com.au.eventplanning.model.Decoration;
import com.au.eventplanning.model.Occasion;

import java.util.ArrayList;
import java.util.List;

public interface DecorationDao {

    int insertDecoration(long id,long venueId, String name);
    List<Decoration> getAllDecorations();
}
