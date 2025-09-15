package com.example.collage.dao.collegeDaoIMPL;

import com.example.collage.Entity.College;
import com.example.collage.dao.CollegeDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Scanner;

@Repository
public class CollegeImpl  implements CollegeDAO {
    Scanner sc = new Scanner(System.in);

    private final EntityManager theManager;

    @Autowired
    public CollegeImpl(EntityManager theManager) {
        this.theManager = theManager;
    }


    @Override
    @Transactional
    public void save(College theCollege) {
        theManager.persist(theCollege);
        System.out.println("College saved successfully....!");
    }

    @Override
    public College findById(int id) {
        College found =  theManager.find(College.class,id);
        if (found!=null) {
            return found;
        }
        else {
            return null;
        }
    }

    @Override
    @Transactional
    public void updateById(int id) {

        College found = theManager.find(College.class,id);
        if (found==null){

            System.out.println("No College found with the ID");
        }
        else {
            System.out.println("Which field you want to edit :");
            System.out.println("1. College name , 2. College Type, 3. Specialization, 4. No.Of Students, 5. Cutt Off");
            System.out.println("Enter option ");
            int opt = sc.nextInt();
            sc.nextLine();
            switch (opt){
                case 1 :{
                    System.out.println("Enter New  Name : ");
                    found.setName(sc.nextLine());
                    break;
                }
                case 2 :{
                    System.out.println("Enter New college type : ");
                    found.setType(sc.nextLine());
                    break;
                }
                case 3 :{
                    System.out.println("Enter New Specialization : ");
                    found.setSpecialization(sc.nextLine());
                    break;
                }
                case 4 :{
                    System.out.println("Enter New No. of student : ");
                    found.setStudent(sc.nextInt());
                    break;
                }
                case 5 :{
                    System.out.println("Enter New Cutt off : ");
                    found.setCutOff(sc.nextDouble());
                    break;
                }
                default:System.out.println("Invalid Option !");
            }
        }
    }

    @Override
    @Transactional
    public void removeById(int id) {

        College found = findById(id);
        if (found==null){
            System.out.println("No College found !");
        }else{
            theManager.remove(found);
            System.out.println("College removed successfully..!");
        }
    }

    @Override
    public List<College> fetchAll() {
        Query q = theManager.createQuery("select c from College c");
        return q.getResultList();
    }
}
