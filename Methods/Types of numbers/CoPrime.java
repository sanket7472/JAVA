import java.util.Scanner;
class CoPrime 
{
	// CoPrime number having highest common factor is 1 
	// highest number which can divide both numbers is 1
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		if (isCoPrime(num1,num2))
		{
			System.out.print(num1 +" And "+num2 +" are CoPrimes ");
			return;
		}
		System.out.print(num1 +" And "+num2 +" are not CoPrimes ");	
	}
	public static boolean isCoPrime(int num1 , int num2)
	{
		return hcf(num1,num2)==1;
	}
	public static int hcf(int num1 , int num2)
	{
		int min = num1<num2 ? num1 :num2;
		while (true)
		{
			if (num1%min==0 && num2%min==0)
			{
				return min;
			}
			min--;
		}
	}
}
