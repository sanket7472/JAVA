import java.util.Scanner;
class GoodPrimeNumber 
{
	// Good prime numbers are the prime numbers Which having all the digits are prime 
	public static void main(String[] args) 
	{
		System.out.print("Enter a Start : ");
		int start = new Scanner(System.in).nextInt();
		if (start<=0)
		{
			System.out.print("Start should be from 1");
			System.exit(0);
		}
		System.out.print("Enter a Range : ");
		int range = new Scanner(System.in).nextInt();
		int cnt = 0;
		for (int i = start;i<=range ;i++ )
		{
			boolean prime = true;
			for (int j =2;j<i ;j++ )
			{
				if (i%j==0)
				{
					prime=false;
					break;
				}
			}
			if (prime)
				{
					boolean good = true;
					for (int m = i;m>0 ;m/=10 )
					{
						int rem = m%10;
						if (rem<2)
						{
							good=false;
							break;
						}
						for (int k = 2;k<rem ;k++ )
						{
							if (rem%k==0)
							{
								good = false;
								break;
							}
						}
					}
					if (good)
					{
						System.out.print(i+"  ");
						cnt++;
					}
				}
		}
		System.out.print("\n cnt of good prime number : "+cnt);
	}
}
