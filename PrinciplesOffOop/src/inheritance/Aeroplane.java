package inheritance;

public class Aeroplane {

	String brand;
	double price;
	int engines;
	int years;
	int fuelCap;
	int weight;
	int passengerCap;
	
	public Aeroplane() {}
	
	public Aeroplane( String brand, double price, int engines, int years, int fuelCap, int weight, int passengerCap )
	{
		this.brand = brand;
		this.price = price;
		this.engines = engines;
		this.years = years;
		this.fuelCap = fuelCap;
		this.passengerCap = passengerCap;
		
	}
	
	public void displayAeroplane() {
		
		System.out.println(brand);
		System.out.println(price);
		System.out.println(engines);
		System.out.println(years);
		System.out.println(fuelCap);
		System.out.println(weight);
		System.out.println(passengerCap);
	
	}
}
