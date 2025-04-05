class Mobile 
{
	String brand;
	String model;
	byte ram;
	short rom;
	int price;
	int numOfCameras;
	
	Mobile()
	{}
	public void showMobile()
	{
		System.out.println(brand);
		System.out.println(model);
		System.out.println(ram);
		System.out.println(rom);
		System.out.println(price);
		System.out.println(numOfCameras);
		System.out.println("----------------------------------------------");
	}
}
