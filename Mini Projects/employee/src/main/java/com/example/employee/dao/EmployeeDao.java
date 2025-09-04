package com.example.employee.dao;

import com.example.employee.entity.Employee;
import com.example.employee.entity.Movies;

import java.util.List;

public interface EmployeeDao {

    public void save(Employee theEmploee);
    //public void saveMovie(Movies theMovie);
    public Employee findById(int id);
    public Employee findByContactNO(long phno);
    public List<Employee> findAll();
    public void updateById(int theId);
    public void removeById(int theId);

    /*
    * Assignment :->
    * 1) create methods for each and every operation in main class
    *
    * */
}
