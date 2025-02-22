import java.util.Scanner;
class SpyNumber 
{
	public static void main(String[] args) 
	{
		/*
			a number in which sum and product of all digits
			from the number are equal to each other 
		*/
		System.out.print("Enter Number : ");
		int num = new Scanner(System.in).nextInt();           //123;
		int sum= 0, product = 1;
		for (int i = num;i>0 ;i/=10 )
		{
			sum += i%10;
			product *= i%10;
		}
		System.out.print(sum==product?
			num + " is a SPY Number ":num + " is not a SPY Number " );
	}
}
