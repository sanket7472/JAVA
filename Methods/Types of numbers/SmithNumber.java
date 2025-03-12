import java.util.Scanner;
class SmithNumber 
{
	public static void main(String[] args)
	{
		System.out.print("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		if (isSmith(num)) 
		{
			System.out.print(num + " is a Smith Number ");
			return;
		}
		System.out.print(num + " is not a Smith Number ");
	}
	public static boolean isSmith(int n)
	{
		int sum = sumOfDigits(n);
		int sumOfPrimes = 0;
		for (int i = 2;i<=n ;i++ )
		{
			if (n%i==0)
			{
				if (isPrime(i))
				{
					sumOfPrimes += sumOfDigits(i);
					n /= i;
					i = 2;
				}
			}
		}
		return sum == sumOfPrimes ? true : false;
	}
	
	public static boolean isPrime(int num)
	{
		int den = 2;
		while(den<num) 
		{
			if (num%den == 0) 
			{
				return false;
			}
			den++ ;
		}
		return true;
	}
	public static int sumOfDigits(int num)
	{
		int sum = 0;
		while (num>0)
		{
			sum += num%10;
			num/=10;
		}
		return sum;
	}
}
