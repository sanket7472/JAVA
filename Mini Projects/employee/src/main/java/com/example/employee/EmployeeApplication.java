package com.example.employee;

import com.example.employee.dao.EmployeeDao;
import com.example.employee.entity.Employee;
import com.example.employee.entity.Movies;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class EmployeeApplication {
    Scanner sc = new Scanner(System.in);
    public void save(EmployeeDao theEmployeeDao){
        System.out.println("Enter Employee First Name: ");
        String firstName = sc.nextLine();
        System.out.println("Enter Employee Last Name: ");
        String lastName = sc.nextLine();
        System.out.println("Enter Employee Contact no.: ");
        long contact = sc.nextLong();

        System.out.println("Enter Employee Designation : ");
        sc.nextLine();
        String designation = sc.nextLine();
        System.out.println("Enter Employee salary : ");
        double sal = sc.nextDouble();

        theEmployeeDao.save(new Employee(firstName,lastName,contact,designation,sal));
        System.out.println("Employee Saved Successfully ");
    }
    public void findById(EmployeeDao theEmployeeDao){
        System.out.println("Enter the Employee id :");
        Employee found = theEmployeeDao.findById(sc.nextInt());
        if (found!=null){
            System.out.println(found);
        }
        else {
            System.out.println("No Employee found with the ID");
        }
    }
    public void findByContactNO(EmployeeDao theEmployeeDao){
        System.out.println("Enter the Employee Contact no :");
        Employee found = theEmployeeDao.findByContactNO(sc.nextLong());

        if (found!=null){
            System.out.println(found);
        }
        else {
            System.out.println("No Employee found with the contact no");
        }
    }

    public void fetchAll(EmployeeDao theEmployeeDao){
        List<Employee> employees= theEmployeeDao.findAll();
       if (employees.size()!=0){
           for (Employee emp : employees) {
               System.out.println(emp);
           }
       }else{
           System.out.println("No Employees in the DB");
       }
    }
    public void updateById(EmployeeDao theEmployeeDao){
        System.out.println("Enter the Employee id : ");
        theEmployeeDao.updateById(sc.nextInt());
    }

    public void deleteById(EmployeeDao theEmployeeDao){
        System.out.println("Enter Employee id for deleting the emp :");
        theEmployeeDao.removeById(sc.nextInt());
    }
    @Bean
    public CommandLineRunner commandLineRunner (EmployeeDao theEmployeeDao){
        return runner ->{

          for (;;){
              System.out.println("***OPERATIONS***");
              System.out.println("1. Save Employee ");
              System.out.println("2. Find Employee by ID ");
              System.out.println("3. Find Employee by contact no. ");
              System.out.println("4. Details of all Employees ");
              System.out.println("5. Update any employee by ID");
              System.out.println("6. Delete Employee ");
              System.out.println("7. Exit ");
              System.out.print("Enter the method number from : ");
              int opt = sc.nextInt();
              switch (opt){
                  case 1:save(theEmployeeDao);break;
                  case 2:findById(theEmployeeDao);break;
                  case 3:findByContactNO(theEmployeeDao);break;
                  case 4:fetchAll(theEmployeeDao);break;
                  case 5:updateById(theEmployeeDao);break;
                  case 6:deleteById(theEmployeeDao);break;
                  case 7:{
                      System.out.println("Thanks for Visiting..!");
                      System.exit(0);
                  }
                  default: System.out.println("Invalid option");
              }
          }

        };
    }
	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class,args);
	}

}
