class Overload 
{
	// in this code addition method is defined four times with change in number of formal arguments
	public static void main(String[] args) 
	{
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
		add(10,20,30,40,50);
	}
	public static void add(int a,int b, int c)
	{
		System.out.println("Three Arguments "+a+b+c);
	}
	public static void add(int a,int b, int c, int d)
	{
		System.out.println("Four Arguments "+a+b+c+d);
	}
	public static void add(int a,int b)
	{
		System.out.println("Two Arguments "+a+b);
	}
	public static void add(int a,int b, int c , int d, int e)
	{
		System.out.println("Five Arguments "+a+b+c+d+e);
	}
}
