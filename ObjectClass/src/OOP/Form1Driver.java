package OOP;

public class  Form1Driver
{
	public static void main(String[] args) 
	{
		Form1 f1 = new Form1();
		f1.displayInfo();

		Form1 f2 = new Form1("Sam", 654321846l, 'm', "12/2/20",894656666l, "o+", "sam@gamil.com");
		f2.displayInfo();
	}
}
