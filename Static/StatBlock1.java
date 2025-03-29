class StatBlock1 
{
	// static block always executes at the class loading process
	// that is before the execution of main method
	static
	{
		System.out.println("From Static Block");
	}
	public static void main(String[] args) 
	{
		System.out.println("From main method");
	}
}
