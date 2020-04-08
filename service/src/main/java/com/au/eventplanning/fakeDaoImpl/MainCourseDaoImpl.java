package com.au.eventplanning.fakeDaoImpl;

import com.au.eventplanning.dao.MainCourseDao;
import com.au.eventplanning.model.MainCourse;

import java.util.ArrayList;
import java.util.List;

public class MainCourseDaoImpl implements MainCourseDao {

    List<MainCourse> mainCourse = new ArrayList<>();

    @Override
    public int insertMainCourse(long id, String name, String dietType, List<String> ingredients) {
        return 0;
    }

    @Override
    public List<MainCourse> getDesserts(List<String> dietType) {
        return null;
    }
}
