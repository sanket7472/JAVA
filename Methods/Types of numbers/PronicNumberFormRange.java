import java.util.Scanner;
class PronicNumberFormRange
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
			if (isPronic(i)) 
			{
					System.out.print(i + "  ");
			}
		}
		
	}
	public static boolean isPronic(int num )
	{
		int i = 1;
		while (true)
		{
			if (i*(i+1)== num)
			{
				return true;
			}
			if (i*(i+1) > num)
			{
				return false;
			}
			i++;
		}
	}
}
