class Shoe 
{
	// here we are setting the shoe price before the execution

	String brand = "Campus";
	double price ;
	int size;
	String color;
	String type;

	{
		// here this non static block is used to give the value of price for each and every shoe
		if (brand.charAt(0) == 'N')
		{
			price = 1000;

		}
		else
		{
			price = 500;

		}
	}
	public void shoeDetails()
	{
		
		System.out.println(brand);
		System.out.println(price);
		System.out.println(size);
		System.out.println(color);
		System.out.println(type);
	}
}
