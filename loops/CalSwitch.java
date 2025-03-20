import java.util.Scanner;
class CalSwitch 
{
	//caculator using switch
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("-----------> WELCOME <----------");
		System.out.println("");
		System.out.println("-----> ARITHMATIC CALCULATOR <----");
		System.out.println("Which operation You want to perform : ");
		System.out.println("");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Modulus");
		System.out.print("Enter the number of option: ");

		int op = sc.nextInt();
		System.out.print("Enter First num: ");
		float num1 = sc.nextFloat();
		System.out.print("Enter second num: ");
		float num2 = sc.nextFloat();

		switch (op)
		{
			  
		case 1:
			{
				System.out.println("Addition of "+num1 + " + " + num2 + " = " +(num1+num2));
				break;
			}
		case 2:
			{
				System.out.println("Substraction of "+num1 + " - " + num2 + " = " +(num1-num2));
				break;	
			}
		case 3:
			{
				System.out.println("Multiplication of "+num1 + " * " + num2 + " = " +(num1*num2));
				break;	
			}
		case 4:
			{
				System.out.println("Division of "+num1 + " / " + num2 + " = " +(num1/num2));
				break;	
			}
		case 5:
			{
				System.out.println("Modulus of "+num1 + " % " + num2 + " = " +(num1%num2));
				break;	
			}
		default:
			{
				System.out.println("Enter Valid Oprator");
			}
		}




	}
}
