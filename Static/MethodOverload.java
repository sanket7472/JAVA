class MethodOverload 
{
	// in this code addition method is defined four times with change in types formal arguments
	public static void main(String[] args) 
	{
		add(10,20);
		add(10.10,20.20);
		add('a','b');
		add("Sam ","Boss");

	}
	public static void add(int a, int b)
	{
		System.out.println("Integer Addition "+a+b);
	}
	public static void add(double a, double b)
	{
		System.out.println("Double Addition "+a+b);
	}
	public static void add(char a, char b)
	{
		System.out.println("Char Addition "+(a+b));
	}
	public static void add(String a, String b)
	{
		System.out.println("Strings Addition "+a+b);
	}
}
