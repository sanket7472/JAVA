class StatBlock3 
{
	// we can have any number of static blocks in a class block 
	// number of static block executes top to bottom sequentially then main method will execute

	static
	{
		System.out.println("From Static Block 1");
	}
	public static void main(String[] args) 
	{
		System.out.println("From Main method");
	}
	static
	{
		System.out.println("From Static Block 2");
	}
	static
	{
		System.out.println("From Static Block 3");
	}
	static
	{
		System.out.println("From Static Block 4");
	}
}
