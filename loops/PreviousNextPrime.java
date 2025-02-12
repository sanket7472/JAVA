import java.util.Scanner;
class PreviousNextPrime
{
	public static void main(String[]args)
	{
		System.out.print("Enter number : ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int prevPrime = 0;
		int nxtPrime = 0;

		for (int i=num-1;i>=2 ;i-- )
		{
			boolean flag = true;
			for (int j = 2;j<i ;j++ )
			{
				if (i%j==0)
				{
					flag = false;
					break;
				}
			}
			if (flag)
			{
				prevPrime = i;
				break;
			}
		}
		for (int i=num+1;i>num ;i++ )
		{
			boolean flag = true;
			for (int j = 2;j<i ;j++ )
			{
				if (i%j==0)
				{
					flag = false;
					break;
				}
			}
			if (flag)
			{
				nxtPrime = i;
				break;
			}
		}
		if (dup-prevPrime > nxtPrime-dup)
		{
			System.out.println("Next prime number is Close ...");
			System.out.print(" User's Number : " + dup +" Next Prime Number : " + nxtPrime);
		}
		else if (dup-prevPrime < nxtPrime-dup)
		{
			System.out.println("Previous prime number is Close ...");
			System.out.print("Previous Prime number : "+prevPrime +" User's Number : " + dup );
		}
		else if (dup-prevPrime == nxtPrime-dup)
		System.out.print("Previous Prime number : "+prevPrime+"  Next Prime Number : " + nxtPrime);
		
	}
}
