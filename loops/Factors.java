import java.util.Scanner;
class Factors 
{
	public static void main(String[] args) 
	{
		System.out.print("enter a number : ");
		int num = new Scanner(System.in).nextInt();
		int cnt = 0;
		for (int i = 2;i<num ;i++ )
		{
			if (num%i==0)
			{
				cnt++;
				System.out.print(i+ " ");
			}
		}
		if (cnt==0)
		{
			System.out.print(num + "  is a prime number.");
		}
		else
		{
			System.out.print("\n"+num + "  is not a  prime number");
			System.out.print(" because the number have : "+ cnt + " factors.");
		}
	}
}
