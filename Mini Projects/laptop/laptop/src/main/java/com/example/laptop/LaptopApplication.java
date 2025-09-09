package com.example.laptop;

import com.example.laptop.dao.LaptopDAO;
import com.example.laptop.entity.Laptop;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class LaptopApplication {

    Scanner sc = new Scanner(System.in);
    public void  saveLaptop(LaptopDAO theLaptopDAO){

        System.out.println("Enter the brand : ");
        String brand = sc.nextLine();
        System.out.println("Enter the Model ");
        String model = sc.nextLine();
        System.out.println("Enter the IMEI no : ");
        long imei = sc.nextLong();
        System.out.println("Enter Price :");
        double price = sc.nextDouble();
        System.out.println("Enter RAM :");
        int ram = sc.nextInt();
        System.out.println("Enter ROM :");
        int rom = sc.nextInt();
        theLaptopDAO.save(new Laptop(brand,model,imei,price,ram,rom));
    }

    public void findById(LaptopDAO theLaptopDAO){
        System.out.println("Enter Laptop id: ");
        Laptop found = theLaptopDAO.findById(sc.nextInt());
        if (found==null){
            System.out.println("No Laptop found with id");
        }else{
            System.out.println(found);
        }
    }
    public void findByImei(LaptopDAO theLaptopDAO){
        System.out.println("Enter Laptop IMEI_no: ");
        Laptop found = theLaptopDAO.findByIMEI(sc.nextLong());
        if (found==null){
            System.out.println("No Laptop found with IMEI_No");
        }else{
            System.out.println(found);
        }
    }
    public void updateByID(LaptopDAO theLaptopDAO){
        System.out.println("Enter the Laptop ID:");
        theLaptopDAO.updateById(sc.nextInt());
    }
    public void delete(LaptopDAO theLaptopDAO){
        System.out.println("Enter laptop ID to delete :");
        theLaptopDAO.removeById(sc.nextInt());
    }
    @Bean
    public CommandLineRunner commandLineRunner(LaptopDAO theLaptopDAO){
      return runner ->{
            for (; ;){
                System.out.println("Which Action You Want to do ");
                System.out.println("1. Add Laptop ");
                System.out.println("2. Find Laptop by ID ");
                System.out.println("3. Find Laptop by IMEI no ");
                System.out.println("4. Update laptop Details ");
                System.out.println("5. Delete Laptop ");
                System.out.println("6. Exit ");
                System.out.print("Enter Option :");
                int opt = sc.nextInt();
                sc.nextLine();
                switch (opt){
                    case 1:saveLaptop(theLaptopDAO);break;
                    case 2:findById(theLaptopDAO);break;
                    case 3:findByImei(theLaptopDAO);break;
                    case 4:updateByID(theLaptopDAO);break;
                    case 5:delete(theLaptopDAO);break;
                    case 6:System.exit(0);
                    default:System.out.println("Enter Valid Option ");
                }

            }

        };
    }
	public static void main(String[] args) {
		SpringApplication.run(LaptopApplication.class, args);
	}

}
