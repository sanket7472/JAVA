import java.util.Scanner;
class Emirp 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number : ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int rev = 0;
		boolean flag = true;
		if (num<2)
		{
			System.out.print(num + " is not a prime number. ");
			//System.exit(0);
		}
		for (int i=2; i<(num/2) ;i++ )
		{
			if (num%i==0)
			{
				flag = false;
				System.out.print(num+" is not a prime number.");
				break;
			}
		}
		if (flag)
		{
			while (num>0)
			{
				rev = rev*10 +(num%10);
				num/=10;
			}
			for (int i=2; i<(rev/2) ;i++ )
			{
			if (rev%i==0)
			{
				flag = false;
				break;
			}
			}
			if (flag)
			{
				System.out.print(dup +"  is an Emirp prime number.");
			}
			else
				System.out.print(dup+"  is a normal prime number not an Emirp prime number");
		}
	}
}
