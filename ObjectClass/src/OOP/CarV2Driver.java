package OOP;

public class CarV2Driver 
{
	public static void main(String[] args) 
	{
		CarV2 c1 = new CarV2("XUV " , "Black",150,8,25);

		c1.showDetails();

		System.out.println("-------------------------------");

		CarV2 c2 = new CarV2("THAR " , "Black",230.5,4,40);

		c2.showDetails();
	}
}
