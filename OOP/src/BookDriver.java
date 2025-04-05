class BookDriver 
{
	public static void main(String[] args) 
	{
		Book b1 = new Book();
		System.out.println(b1);
		System.out.println(b1.brand);
		System.out.println(b1.price);
		System.out.println(b1.pages);
		System.out.println(b1.type);
		System.out.println("---------------------------------------");

		b1.brand = "Classmate";
		b1.price = 50;
		b1.pages = 100;
		b1.type = "long note";
		System.out.println(b1);
		System.out.println(b1.brand);
		System.out.println(b1.price);
		System.out.println(b1.pages);
		System.out.println(b1.type);
		System.out.println("---------------------------------------");

		Book b2 = new Book();
		b2.brand = "Youva";
		b2.price = 50;
		b2.pages = 100;
		b2.type = "long note";
		System.out.println(b2);
		System.out.println(b2.brand);
		System.out.println(b2.price);
		System.out.println(b2.pages);
		System.out.println(b2.type);
	}
}
