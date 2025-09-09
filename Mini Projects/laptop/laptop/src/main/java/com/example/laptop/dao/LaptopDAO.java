package com.example.laptop.dao;

import com.example.laptop.entity.Laptop;
import jakarta.persistence.EntityManager;

public interface LaptopDAO {

public void save(Laptop theLaptop);
public Laptop findById(int id);
public Laptop findByIMEI(long imei);
public void updateById(int id);
public void removeById(int id);

}
