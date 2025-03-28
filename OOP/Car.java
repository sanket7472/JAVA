class Car 
{
	String company;
	String fuel;
	int price;
	String model;
	int mileage;
	int cc;
	int seats;

	public void carCompany()
	{
		System.out.println("Company : "+company);
	}
	public void carFuel()
	{
		System.out.println("Fuel : "+fuel);
	}
	public void carPrice()
	{
		System.out.println("Price : "+price);
	}
	public void carModel()
	{
		System.out.println("Model Name : "+model);
	}
	public void carMileage()
	{
		System.out.println("Mileage : "+mileage);
	}
	public void carCC()
	{
		System.out.println("Engine CC : "+cc);
	}
	public void carSeats()
	{
		System.out.println("Seats in Car : "+seats);
	}
	public void carDetails()
	{
		carCompany();
		carFuel();
		carPrice();
		carModel();
		carMileage();
		carCC();
		carSeats();
	}
	

}
