import java.util.Scanner;
class IncreasingNumber 
{
	// increasing number is number which digits are continiously
	// increase or remains same from left to right
	public static void main(String[] args) 
	{
		System.out.print("Enter a number :");
		int num = new Scanner(System.in).nextInt();  // 112235;
		int rem1 = num%10;
		boolean flag = true;

		for (int i=num ;i>0 ;i/=10 )
		{
			int rem = i%10;
			if (!(rem1>=rem))
			{
				flag = false;
				break;
			}
			rem1 = rem;
		}
		System.out.print(flag?num+ " is a increasing number ": num + " is not a increasing Number ");
	}
}
