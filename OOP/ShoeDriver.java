class ShoeDriver 
{
	public static void main(String[] args) 
	{
		Shoe s1 = new Shoe();
		
		s1.size = 9;
		s1.type = "Sports";
		s1.color = "Grey";

		s1.shoeDetails();
		System.out.println("--------------------------------");

		// calling a parameterized constructor
		Shoe s2 = new Shoe(10 , "Blue ", "Sports");
		s2.shoeDetails();
	}
}
