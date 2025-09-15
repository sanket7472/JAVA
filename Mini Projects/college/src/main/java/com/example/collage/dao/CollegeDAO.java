package com.example.collage.dao;

import com.example.collage.Entity.College;

import java.util.List;

public interface CollegeDAO {


    public void save(College theCollege);
    public College findById(int id);
    public void updateById(int id);
    public void removeById(int id);
    public List<College> fetchAll();

}
