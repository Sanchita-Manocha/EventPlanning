package com.au.eventplanning.fakeDaoImpl;

import com.au.eventplanning.dao.OccasionDao;
import com.au.eventplanning.model.Occasion;

import java.util.ArrayList;
import java.util.List;

public class OccasionDaoImpl implements OccasionDao {

    static List<Occasion> occasions;

    public OccasionDaoImpl() {
        occasions = new ArrayList<>();
    }

    @Override
    public int insertOccasion(long id,String name) {
        if(idExists(id)){
            return 0;
        }
        else {
            occasions.add(new Occasion(id, name));
            return 1;
        }
    }

    @Override
    public List<Occasion> getOccasions() {
        return occasions;
    }

    @Override
    public int editOccasion(long id, String name) {
        if(!idExists(id)){
            return 0;
        }
        occasions.stream().filter(occasion -> occasion.getId()==id)
                .forEach(occasion -> occasion.setName(name));
        return 1;
    }

    boolean idExists(long id){

        return occasions.stream()
                .filter(occasion -> occasion.getId() == id)
                .count() > 0;
    }
}
