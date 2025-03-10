import java.util.Scanner;
class LengthOfNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number : " );
		int num = new Scanner(System.in).nextInt();
		System.out.print("Length of "+num + " is " + count(num , 0));
	}
	public static int count(int num , int ct)
	{
		// normal method
		/*
		if (num == 0)
		{
			return ct ;
		}
		return count(num/10 , ++ct);
		*/
		// optimized method
		return num==0 ? ct : count(num/10 , ++ct);
	}
}
