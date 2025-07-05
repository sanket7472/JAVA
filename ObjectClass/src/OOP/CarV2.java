package OOP;

public class CarV2
{
	 
	 String model;
	 String color;
	 double speed;
	 int seats;
	 int fuelCap;

	 public CarV2(){}

	 public CarV2(String model,String color, double speed,int seats, int fuelCap) {
			this.model = model;
			this.color = color;
			this.speed = speed;
			this.seats = seats;
			this.fuelCap = fuelCap;
	}

	public void showDetails(){
	
		System.out.println("Model : "+model);
		System.out.println("Color : "+color);
		System.out.println("Speed : "+speed);
		System.out.println("Seats : "+seats);
		System.out.println("Fuel Capacity : "+fuelCap + " ltrs");


	}


}
