package com.example.employee.dao.daoimpl;

import com.example.employee.dao.EmployeeDao;
import com.example.employee.entity.Employee;
import com.example.employee.entity.Movies;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Scanner;

@Repository
public class EmployeeDAOImpl implements EmployeeDao {

    private  final EntityManager theManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager theManager) {
        this.theManager = theManager;
    }

    @Override
    @Transactional
    public void save(Employee theEmploee) {
        theManager.persist(theEmploee);
    }

    @Override
    public Employee findById(int id) {
      return  theManager.find(Employee.class,id);
    }

    @Override
    public Employee findByContactNO(long phno) {
        try{
            Query q = theManager.createQuery("select e from Employee e where phno = :phno");
            q.setParameter("phno",phno);
            return (Employee) q.getSingleResult();
        }catch (NoResultException e){
            return null;
        }
    }

    @Override
    public List<Employee> findAll() {
        Query q = theManager.createQuery("select e from Employee e");
        return q.getResultList();
    }

    @Override
    @Transactional
    public void updateById(int theId) {
        Scanner sc = new Scanner(System.in);
        Employee found = theManager.find(Employee.class,theId);
        if (found==null){
            System.out.println("No Employee found for update");
        }else{
            System.out.println("Which field you want to edit :");
            System.out.println("1. FirstName , 2. LastName, 3. Phone no, 4. Designation , 5. Salary");
            int opt = sc.nextInt();
            switch (opt){
                case 1 :{
                    System.out.println("Enter New FirstName : ");
                    found.setFirstName(sc.nextLine());
                    break;
                }
                case 2 :{
                    System.out.println("Enter New LastName : ");
                    found.setLastName(sc.nextLine());
                    break;
                }
                case 3 :{
                    System.out.println("Enter New Contact no : ");
                    found.setPhno(sc.nextLong());
                    break;
                }
                case 4 :{
                    System.out.println("Enter New Designation : ");
                    found.setDesignation(sc.nextLine());
                    break;
                }
                case 5 :{
                    System.out.println("Enter New Salary: ");
                    found.setSalary(sc.nextDouble());
                    break;
                }
                default:System.out.println("Invalid Option !");
            }
        }
    }

    @Override
    @Transactional
    public void removeById(int theId) {
        Employee emp = theManager.find(Employee.class,theId);
        if (emp==null){
            System.out.println("No Employee found for remove");
        }else{
            theManager.remove(emp);
            System.out.println("Emp deleted Successfully...");
        }

    }

//    @Override
//    @Transactional
//    public void saveMovie(Movies theMovie) {
//
//            theManager.persist(theMovie);
//
//    }
}
