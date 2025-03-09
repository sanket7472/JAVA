import java.util.Scanner;
class UglyNumberFormRange
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Start :");
		int start = sc.nextInt();
		System.out.print("Enter End : ");
		int end = sc.nextInt();
		for (int i = start;i<=end ;i++ ) 
		{
			if (isUgly(i)) 
			{
					System.out.print(i + "  ");
			}
		}
		
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