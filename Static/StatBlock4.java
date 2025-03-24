class StatBlock4
{
	static double d;
	static
	{
		d = test(100);
		System.out.println("1 :"+d);
		d = test(d) + demo((int)d);
		System.out.println("2 :"+StatBlock4.d);
		System.out.println("3 :"+d);
	}
	public static void main(String[] args) 
	{
		System.out.println("4 :"+d);
		System.out.println("5 :"+test(d));
		System.out.println("6 :"+demo((int)d));
	}
	public static double test(double num)
	{
		return num*num;
	}
	public static char demo(int num)
	{
		return(char)num;
	}
}
