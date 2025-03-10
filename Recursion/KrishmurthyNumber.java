import java.util.Scanner;
class KrishmurthyNumber
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number : ");
		int num = new Scanner(System.in).nextInt();
		if (isKrishnmurthy(num))
		{
			System.out.print(num + " is a Krishmurthy Number");
			return;
		}
	 System.out.print(num + " is not Krishmurthy Number");
	}
	public static boolean isKrishnmurthy(int num )
	{
		int sum = sum(num , 0);
		return sum==num ? true : false ;
	}
	public static int sum(int num , int sum )
	{
		return num == 0 ? sum : sum(num/10 , (sum += fact(num%10)));
	}
	public static int fact(int num)
	{
		return num==1 ? 1 : num * fact(num-1);
	}
}
