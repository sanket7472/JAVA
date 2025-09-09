package com.example.laptop.dao.daoIMPL;

import com.example.laptop.dao.LaptopDAO;
import com.example.laptop.entity.Laptop;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Scanner;

@Repository
public class LaptopImpl implements LaptopDAO {
    Scanner sc = new Scanner(System.in);
    EntityManager theManager;

    @Autowired
    public LaptopImpl(EntityManager theManager) {
        this.theManager = theManager;
    }

    @Override
    @Transactional
    public void save(Laptop theLaptop) {
        theManager.persist(theLaptop);
    }

    @Override
    public Laptop findById(int id) {
        Laptop found =  theManager.find(Laptop.class,id);
        if (found!=null) {
            return found;
        }
        else {
            return null;
        }
    }

    @Override
    public Laptop findByIMEI(long imei) {
        try{
        Query q = theManager.createQuery("select l from Laptop l where imei_no = :imei");
        q.setParameter("imei",imei);
        return (Laptop) q.getSingleResult();
         }catch (NoResultException e){
        return null;
        }
    }

    @Override
    @Transactional
    public void updateById(int id) {
        Laptop found = theManager.find(Laptop.class,id);
        if (found==null){

            System.out.println("No Laptop found with the ID");
        }
        else {
            System.out.println("Which field you want to edit :");
            System.out.println("1. Brand name , 2. Model name, 3. Price, 4. RAM, 5. ROM");
            System.out.println("Enter option ");
            int opt = sc.nextInt();
            sc.nextLine();
            switch (opt){
                case 1 :{
                    System.out.println("Enter New Brand Name : ");
                    found.setBrand(sc.nextLine());
                    break;
                }
                case 2 :{
                    System.out.println("Enter New Madel name : ");
                    found.setModel(sc.nextLine());
                    break;
                }
                case 3 :{
                    System.out.println("Enter New Price : ");
                    found.setPrice(sc.nextDouble());
                    break;
                }
                case 4 :{
                    System.out.println("Enter New RAM : ");
                    found.setRam(sc.nextInt());
                    break;
                }
                case 5 :{
                    System.out.println("Enter New ROM : ");
                    found.setRom(sc.nextInt());
                    break;
                }
                default:System.out.println("Invalid Option !");
            }
        }

    }

    @Override
    @Transactional
    public void removeById(int id) {

        Laptop found = findById(id);
        if (found==null){
            System.out.println("No Laptop found !");
        }else{
            theManager.remove(found);
            System.out.println("Laptop removed successfully..!");
        }

    }
}
