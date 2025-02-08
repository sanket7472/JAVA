import java.util.Scanner;
class tempConvert 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temp in degree : ");
		float temp = sc.nextFloat();
		System.out.println("-------->WELCOME<--------");
		System.out.println("1. Convert in Fahrenheit ");
		System.out.println("2. Convert in Kelvin ");
		System.out.println("3. Convert in Rankine ");
		System.out.print("Enter option : ");
		int opt = sc.nextInt();

		switch (opt)
		{
		case 1:
			{
				System.out.print("Temperature in Fahrenheit : ");
				System.out.print((temp*9/5f)+32f +" F ");
				break;
			}
		case 2 :
			{
				System.out.print("Temperature in Kelvin : ");
				System.out.print((temp+273.15f) +" K");
				break;
			}
		case 3 :
			{
				System.out.print("Temperature in Rankine : ");
				System.out.print((temp*9/5f)+491.67f + " R");
				break;
			}
		
		}





	}
}
