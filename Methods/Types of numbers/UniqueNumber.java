import java.util.Scanner;
class UniqueNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		if (isUnique(num))
		{
			System.out.println(num + " is a Unique Number");
			return;
		}
			System.out.println(num + " is not a Unique Number");
		
	}
	public static boolean isUnique(int num)
	{
		for (int i = 0;i<=9 ;i++ )
		{
			int cnt = 0;
			for (int j = num;j>0 ;j/=10 )
			{
				if (j%10 == i)
				{
					cnt++;
				}
			}
			if (cnt>1)
			{
				return false;
			}
		}
		return true;
	}
}
