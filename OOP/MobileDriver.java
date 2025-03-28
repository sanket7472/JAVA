class MobileDriver 
{
	public static void main(String[] args) 
	{
		Mobile m1 = new Mobile();
		m1.brand = "Samsung";
		m1.model = "S23 Ultra " ;
		m1.ram = 8;
		m1.rom = 128;
		m1.price = 69999;
		m1.numOfCameras = 3;
		m1.showMobile();

		Mobile m2 = new Mobile();
		m2.brand = "Apple";
		m2.model = "Iphone 16 pro " ;
		m2.ram = 12;
		m2.rom = 512;
		m2.price = 150999;
		m2.numOfCameras = 3;
		m2.showMobile();

		Mobile m3 = new Mobile();
		m3.brand = "Vivo";
		m3.model = "V15 Pro " ;
		m3.ram = 8;
		m3.rom = 128;
		m3.price = 25999;
		m3.numOfCameras = 2;
		m3.showMobile();
	}
}
