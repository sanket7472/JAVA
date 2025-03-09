import java.util.Scanner;
class ArmStrongNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number : ");
		int num = new Scanner(System.in).nextInt();
		if (isArmStrong(num , num , 0))
		{
			System.out.print(num + " is a ArmStrong Number");
			return;
		}
		System.out.print(num + " is not ArmStrong Number");
	}
	public static boolean isArmStrong(int num , int temp , int sum)
	{
		// optimize method
		return num == sum ? true :isArmStrong(num , temp/10 , sum += power(temp%10 , count(num , 0) ));
		//normal method
		/*
		if (num == sum)
		{
			return true;
		} 
		int ct = count(num , 0);
		int pow = power(temp%10 ,ct );
		temp /= 10;
		sum += pow;
		return isArmStrong(num , temp , sum);
		*/
	}
	public static int count(int num , int ct)
	{
		return num==0 ? ct : count(num/10 , ++ct);
	}
	public static int power (int num , int pow)
	{
		return pow == 0 ? 1 : num * (power(num , --pow));
	}
}
