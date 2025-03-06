import java.util.Scanner;
class HCF 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.print("Enter second number : ");
		int num2 = sc.nextInt();
		System.out.println( "HCF is "+hcf(num1,num2));
	}
	public static int hcf(int num1 , int num2)
	{
		int min = num1<num2 ? num1 :num2;
		while (true)//min!=1
		{
			if (num1%min==0 && num2%min==0)
			{
				return min;
			}
			min--;
		}
		//return 1;
	}
}