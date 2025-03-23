class StatBlock2 
{
	// we can execute any other method before main method using static block
	// static block can not execute without main method 
	// main method is compulsory
	static
	{
		test();
	}
	public static void main(String[] args) 
	{
		System.out.println("From main method");
	}
	public static void test()
	{
		System.out.println("From test method");
	}

}
