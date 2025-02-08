import java.util.Scanner;
class OddEvenConvert 
{
	public static void main(String[] args) 
	{
		System.out.print(" Enter a number : ");
		int num = new Scanner (System.in).nextInt();
		int cnt = 0;
		int rev = 0;
		for (int i = num; i>0 ;i/=10 )
		{
			cnt++;
		}
		if (cnt%2==0)
		{
			System.out.println("The number Is of Even length that is "+cnt);
			System.out.print("The updated number : ");
			for (int j = 1; j<=cnt ;j++ )
			{
				if ((j%10)%2==0)
				{
						System.out.print(j%10);		
				}
				else if ((j%10)%2!=0)
				{
					System.out.print((j%10)+1);		
				}
			}
		}
		
		else if (cnt%2!=0)
		{
			System.out.println("The number Is of Odd length that is "+cnt);
			System.out.print("The updated number : ");
			for (int j =1; j<=cnt ;j++ )
			{
				if ((j%10)%2==0)
				{
						System.out.print((j%10)+1);		
				}
				else if ((j%10)%2!=0)
				{
					System.out.print((j%10));		
				}
			}
		}
	}
}
