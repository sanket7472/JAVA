package Encapsulation;

public class Mobile {
	
	String brand;
	String model;
	double price;
	int ram;
	int rom;// extendible
	Sim s;
	
	
	public Mobile(String brand,String model, double price, int ram, int rom) {
		
		this.brand = brand;
		this.model = model;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
		
	}
	
	public String getBrand() {
		return brand;
	}
	
	public String getModel() {
		return model;
	}
	public double getPrice() {
		return price;
	}
	public int getRam() {
		return ram;
	}
	public int getRom() {
		return rom;
	}
	
	public void setRom(String brand, String model, int erom) {
		if (this.brand == brand && this.model == model) {
			
			rom += erom;
			
		} else {
			System.out.println("Invalid Credentials ");
		}
	}
	public void insertSim(String serviceProvider,String network, String type, long mobNo) {
		
		s = new Sim(serviceProvider, network, type, mobNo);
		System.out.println("Sim Inserted....");
	}
}
