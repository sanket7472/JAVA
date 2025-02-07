import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		System.out.print("enter number : ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int sum = 0;
		int evenSum = 0;
		while (num>0)
		{
			int rem = num%10;
			int fact = 1;
			int fact1 = 0;
			if (rem % 2==1)
			{
				for (int i = rem; i>1 ;i-- )
					fact *=i;
				
			}
			else if (rem%2==0)
			{
				for (int j = rem; j>1 ;j-- )
				
					fact1 *=j;

			}
			num/=10;
				sum+=fact;
				evenSum += fact1;
		}
	}
	
		System.out.print(" Sum of Factorials of odd digits from given num : "+sum);
		System.out.print(" \n Sum of Factorials of Even digits from given num : "+evenSum);
	}
}
