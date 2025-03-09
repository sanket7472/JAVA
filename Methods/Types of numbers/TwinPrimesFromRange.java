import java.util.Scanner;
class TwinPrimesFromRange 
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
			int nxt = nxtPrime(i);
			if (isTwin(i,nxt))
			{
				System.out.print(i+"-"+nxt+"  ");
			}
		}
	}
	public static boolean isTwin(int num1 ,int num2)
	{
		if (isPrime(num1)&&isPrime(num2))
		{
			if (num2 -num1 <=2)
			{
				return true;
			}
			return false;
		}
		return false;
	}
	public static int nxtPrime(int num)
	{
		while (true)
		{
			num++;
			if (isPrime(num))
			{
				return num;
			}
		}
	}
	public static boolean isPrime(int num )
	{
		for (int i = 2;i<num ;i++ )
		{
			if (num%i == 0)
			{
				return num == i ? true : false;
			}	
		}
		return true;
	}
}
