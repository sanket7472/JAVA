package inheritance;

public class FighterPlaneSuper extends Aeroplane {
		
	int gen;
	int noOfSeats;
	int range;
	String type;
	String refuelType;
	
	public FighterPlaneSuper() {}

	public FighterPlaneSuper( String brand, double price, int engines, int years, int fuelCap, int weight, int passengerCap,
			int gen, int noOfSeats, int range, String type, String refuelType)
	{
		super(brand, price, engines, years, fuelCap, passengerCap );

//		this.brand = brand;
//		this.price = price;
//		this.engines = engines;
//		this.years = years;
//		this.fuelCap = fuelCap;
//		this.passengerCap = passengerCap;
		
		this.gen = gen;
		this.noOfSeats = noOfSeats;
		this.range = range;
		this.type = type;
		this.refuelType = refuelType;
		
		
	}
	public void displayFighterPlaneSuper() {
		
		displayAeroplane();
		System.out.println(gen);
		System.out.println(noOfSeats);
		System.out.println(range);
		System.out.println(type);
		System.out.println(refuelType);
	
	}
}
