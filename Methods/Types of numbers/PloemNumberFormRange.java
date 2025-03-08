import java.util.Scanner;
class PloemNumberFormRange
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Start :");
		int start = sc.nextInt();
		System.out.print("Enter End : ");
		int end = sc.nextInt();
		for (int i = start; i<=end ;i++ ) 
		{
			if (!(isXylem(i)))
			{
					System.out.print(i + "  ");
			}
		}
	}
	public static boolean isXylem(int num)
	{
		int sumOfExternal = num%10;
		int sumOfMiddle = 0;
		num/=10;
		while (num>9)
		{
			sumOfMiddle += (num%10);
			num/=10;
		}
		sumOfExternal += num;
		return sumOfMiddle == sumOfExternal;
	}
}
