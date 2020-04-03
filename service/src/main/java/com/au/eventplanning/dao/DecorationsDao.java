package com.au.eventplanning.dao;

import com.au.eventplanning.model.Decoration;

import java.util.List;

public interface DecorationsDao {

    int insertDecoration(long id,long venueId, String name);
    List<Decoration> getAllDecorations();
}
