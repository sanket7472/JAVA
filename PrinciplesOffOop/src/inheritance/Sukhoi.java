package inheritance;

public class Sukhoi extends FighterPlane {

	String model;
	String weopons;
	String country;
	String service;
	
	public Sukhoi() {}
	
	public Sukhoi( String brand, double price, int engines, int years, int fuelCap, int weight, int passengerCap,
			int gen, int noOfSeats, int range, String type, String refuelType , String model, String weopons,
			String country, String service)
	{
		this.brand = brand;
		this.price = price;
		this.engines = engines;
		this.years = years;
		this.fuelCap = fuelCap;
		this.passengerCap = passengerCap;
		this.gen = gen;
		this.noOfSeats = noOfSeats;
		this.range = range;
		this.type = type;
		this.refuelType = refuelType;
		
		this.model = model;
		this.weopons = weopons;
		this.country = country;
		this.service = service;
		
	}
	
	public void displaySukhoi()
	{
		displayFighterPlane();
		System.out.println(model);
		System.out.println(weopons);
		System.out.println(country);
		System.out.println(service);
	}
}
