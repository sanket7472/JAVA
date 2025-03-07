import java.util.Scanner;
class DisariumNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		if (isDisarium(num))
		{
			System.out.println(num + " is a Disarium Number ");
			return;
		}
		System.out.println(num + " is not a Disarium Number ");
	
	}
	public static boolean isDisarium(int num)
	{
		int dup = num ;
		int sum = 0;
		while (num!=0)
		{
			int ct = count(num);
			sum += power(num%10 , ct);
			num/=10;
		}
		return dup == sum;
	}
	public static int count(int num)
	{
		int ct = 0;
		while (num!=0)
		{
			ct++;
			num/=10;
		}
		return ct;
	}
	public static int power(int num, int ct )
	{
		int pow = 1;
		for (int i = ct;i>=1 ;i-- )
		{
			pow *= num;
		}
		return pow;
	}
}
