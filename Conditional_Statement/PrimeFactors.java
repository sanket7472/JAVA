import java.util.Scanner;
class PrimeFactors 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number to find prime factors : ");
		int num = new Scanner(System.in).nextInt();
		int cnt = 0;
		for (int i=1;i<=(num/2) ;i++ )
		{
			if (num%i==0)
			{
				for (int j=2;j<=i ;j++ )
				{
					if (i%j==0)
					{
						cnt++;
						System.out.print(j+ "  ");
					}
				}
			}
		}
		System.out.print("\n There are "+ cnt +" prime factors.");
	
		if (cnt==0)
		{
			System.out.print("\n There are no  prime factors of "+num);
		}
	}
}
