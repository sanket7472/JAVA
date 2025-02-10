import java.util.Scanner;
class PrimeFactors 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number to find prime factors : ");
		int num = new Scanner(System.in).nextInt();
		int cnt = 0;
		int fact = 0;
	
		for (int i=2;i<(num/2) ;i++ )
		{
			if (num%i==0)
			{
				fact = 2;
				while (fact<i)
				{
					if (i%fact==0)
					{
						break;
					}
					fact++;
				}
			}
			if (fact == i)
		{
			System.out.print(i +"    ");
		}
		}
		
		
	}
}
