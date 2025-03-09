import java.util.Scanner;
class UglyNumber 
{
	// the number have only prime factors --> 2,3,5
	public static void main(String[] args) 
	{
		System.out.print("Enter num : ");
		int num = new Scanner(System.in).nextInt();
		if (isUgly(num ))
		{
			System.out.print(num + " is an Ugly number ");
			return;
		}
		System.out.print(num + " is not an Ugly number ");
	}
	public static boolean isUgly(int num)
	{
		while (num>1)
		{
			if (num % 2 == 0)
			{
				num/=2;
			}
			else if (num % 3 == 0)
			{
				num/=3;
			}
			else if (num % 5 == 0)
			{
				num/=5;
			}
			else
			{
				return false;
			}

		}
		return true;
	}
}
