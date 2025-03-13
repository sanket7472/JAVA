import java.util.Scanner;
class  ReverseNum
{//this code help the user to reverse the number
	public static void main(String[] args) 
	{
		System.out.println("Ennter number : ");
		int num = new Scanner(System.in).nextInt();
		int dup = num;
		int rev = 0;
		if (num<0)
			num = -(num);
		for (int i=num;i>0 ;i/=10 )
		{
			rev *= 10;
			rev +=i%10;
		}

		if (dup<0)
		{
			rev = -(rev);
			System.out.print(rev);
		}
		else 
		System.out.print(rev);

		if (rev==dup)
			System.out.print("Number is Palindrome.");
		else
			System.out.print("Number is not Palindrome.");

	}
}
