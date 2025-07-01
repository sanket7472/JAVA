class NonStatState
{
	
		String brand = "Nike";
		String type;
		int size;
		double price;
	
	public void showDetails()
	{
		String brand = "Adidas";
		// local variable
		System.out.println(brand);// here the local variable will call
		System.out.println(this.brand);// here nonstatic variable will call
		System.out.println(type);
		System.out.println(size);
		System.out.println(price);
	}

}
