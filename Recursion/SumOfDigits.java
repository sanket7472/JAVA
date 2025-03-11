import java.util.Scanner;
class SumOfDigits 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number : " );
		int num = new Scanner(System.in).nextInt();
		System.out.println("Sum of all digits from "+num + " is " +sumOfDigits(num , 0));
	}
	public static int sumOfDigits(int num , int sum )
	{
		// normal method
		/*
		if (num==0)
		{
			return sum;
		}
		return sumOfDigits(num/10 , (sum + num%10));
		*/
		// optimized method
		return num == 0 ? sum : sumOfDigits(num/10 , (sum + num%10));
	}
}
