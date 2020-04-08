package com.au.eventplanning.fakeDaoImpl;

import com.au.eventplanning.dao.DecorationDao;
import com.au.eventplanning.model.Decoration;

import java.util.ArrayList;
import java.util.List;

public class DecorationDaoImpl implements DecorationDao {


    List<Decoration> decorations = new ArrayList<>();

    @Override
    public int insertDecoration(long id, long venueId, String name) {
        return 0;
    }

    @Override
    public List<Decoration> getAllDecorations() {
        return null;
    }
}
