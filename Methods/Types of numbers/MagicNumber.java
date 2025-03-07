import java.util.Scanner;
class MagicNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter num : ");
		int num = new Scanner(System.in).nextInt();
		if (isMagic(num ))
		{
			System.out.print(num + " is an Magic number ");
			return;
		}
		System.out.print(num + " is not an Magic number ");
	}
	public static boolean isMagic(int num)
	{
		while (true)
		{
			num = sumOfDigits(num);
			if (num <10)
			{
				return num == 1 ? true : false;
			}
		}
	}
	public static int sumOfDigits(int num)
	{
		int sum = 0;
		while (num>0)
		{
			sum += num%10;
			num/=10;
		}
		return sum;
	}
}
