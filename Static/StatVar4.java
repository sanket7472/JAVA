class StatVar4 
{
	static String s;
	// defining a variable
	public static void main(String[] args) 
	{
		// calling the staic variable
		System.out.println(s);
		demo();
		String s = "Sam";
		System.out.println(s); // here the local variable is called
		System.out.println(StatVar4.s); // here calling the static variable using class reference
		
	}
	public static void demo()
	{
		s = "Qspiders";
		System.out.println(s);
	}
}
