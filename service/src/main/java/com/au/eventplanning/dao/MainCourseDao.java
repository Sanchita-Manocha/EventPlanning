package com.au.eventplanning.dao;

import com.au.eventplanning.model.MainCourse;
import com.au.eventplanning.model.Occasion;

import java.util.ArrayList;
import java.util.List;

public interface MainCourseDao {

    int insertMainCourse(long id, String name, String dietType, List<String> ingredients);
    List<MainCourse> getDesserts(List<String> dietType);
}
