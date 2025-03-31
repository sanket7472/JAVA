class StatInitializers 
{
	// static initializers are the static variables declare and initialize at the same time
	// static declare and initialization statement is a variable declare and and intialize in 
	// the static block or in the class block 
	static double pi = 22.0/7.0 ;
	public static void main(String[] args) 
	{
		area(20);
		circumference(20);
	}
	public static void area(int rad)
	{
		double area = pi * (rad*rad);
		System.out.println(area);
	}
	public static void circumference(int rad)
	{
		double circum = 2* pi * rad;
		System.out.println(circum);
	}
}
