package relationship;

import java.util.Scanner;

public class Pen {
	
	String brand;
	double price;
	String type;
	Refill ref;
	
	Scanner sc = new Scanner(System.in);
	  // first way of creating refill 
	// using Scanner class
//	{
//		System.out.println("Enter Color of Refill : ");
//		String color = sc.next();
//		
//		System.out.println("Enter type of Refill : ");
//		String type = sc.next();
//		
//		System.out.println("Enter Size of Refill : ");
//		double size = sc.nextDouble();
//		
//		ref = new Refill(color, type, size);
//		
//	}
	 
	// second way We can take all inputs in constructor and directly create the object
	// of Refill in the constructor of pen
	public Pen(String brand, double price, String penType, String color, String type, double size) {
		
		ref = new Refill(color, type, size);		
		this.brand = brand;
		this.price = price;
		this.type = penType;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getType() {
		return type;
	}
	
	
}
