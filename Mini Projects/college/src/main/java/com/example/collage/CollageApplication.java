package com.example.collage;

import com.example.collage.Entity.College;
import com.example.collage.dao.CollegeDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class CollageApplication {

    Scanner sc = new Scanner(System.in);
    public void  saveCollege(CollegeDAO theCollegeDAO){

        System.out.print("Enter the College Name : ");
        String name = sc.nextLine();
        System.out.print("Enter the college type (Univercity/Autonomus) :");
        String clgtype = sc.nextLine();
        System.out.print("Enter the Specialization : ");
        String sp = sc.nextLine();
        System.out.print("Enter no of Studying students:");
        int std = sc.nextInt();sc.nextLine();
        System.out.print("Enter Address :");
        String add = sc.nextLine();
        System.out.print("Enter Cut off :");
        double cutOff = sc.nextDouble();
        theCollegeDAO.save(new College(name,clgtype,sp,std,add,cutOff));
    }

    public void findById(CollegeDAO theCollegeDAO){
        System.out.println("Enter College id: ");
        College found = theCollegeDAO.findById(sc.nextInt());
        if (found==null){
            System.out.println("No College found with id");
        }else{
            System.out.println(found);
        }
    }
    public void updateByID(CollegeDAO theCollegeDAO){
        System.out.println("Enter the Laptop ID:");
        theCollegeDAO.updateById(sc.nextInt());
    }
    public void delete(CollegeDAO theCollegeDAO){
        System.out.println("Enter College ID to delete :");
        theCollegeDAO.removeById(sc.nextInt());
    }
    public void fetchAll(CollegeDAO theCollegeDAO){
        List<College> colleges= theCollegeDAO.fetchAll();
        if (!colleges.isEmpty()){
            for (College clg : colleges) {
                System.out.println(clg);
            }
        }else{
            System.out.println("No Colleges in the DB");
        }
    }
    @Bean
    public CommandLineRunner commandLineRunner(CollegeDAO theCollegeDAO) {
        return runner -> {
            for (; ; ) {
                System.out.println("Which Action You Want to do ");
                System.out.println("1. Add College ");
                System.out.println("2. Find College by ID ");
                System.out.println("3. Update College Details ");
                System.out.println("4. Delete College ");
                System.out.println("5. Fetch all Laptop ");
                System.out.println("6. Exit ");
                System.out.print("Enter Option :");
                int opt = sc.nextInt();
                sc.nextLine();
                switch (opt) {
                    case 1: saveCollege(theCollegeDAO);break;
                    case 2:findById(theCollegeDAO);break;
                    case 3:updateByID(theCollegeDAO);break;
                    case 4:delete(theCollegeDAO);break;
                    case 5:fetchAll(theCollegeDAO);break;
                    case 6: {
                        System.out.println("Thanks for Visiting..!");
                        System.exit(0);
                    }
                   default:
                        System.out.println("Enter Valid Option ");
                }

            }

        };
    }
    public static void main(String[] args) {
        SpringApplication.run(CollageApplication.class, args);
    }

}
