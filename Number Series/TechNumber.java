import java.util.Scanner;
class TechNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		int len = 0 , div = 1, sum = 0;
		for (int i = num;i>0 ;i/=10 )
		{
			len++;
		}
		if (len%2==0)
		{
			for (int i = 1;i<=(len/2) ;i++ )
			{
				div*=10;
			}

			sum = (num/div)+(num%div);
			int sqr = sum*sum;
			System.out.print(sqr==num?num + " is a TECH Number ":num +" is not a TECH Number");
		}
		else
			System.out.print(num+"is not a TECh Number");

	}
}
