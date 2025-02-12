
import java.util.Scanner;
class MakeNumPrime 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number : ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		//boolean flag = true;
			for (int i = 2;i<num ;i++)
			{
				if (num%i==0)
				{
					//flag = false;
					num++;
					i=2;
				}
			}
				if (num==dup)
					System.out.print("  Entered number "+dup+" is prime . ");
				else
				System.out.print(" \n Entered number is not prime.  Next prime number is :  "+ num+"\n");	
	}
}
