import java.util.Scanner;

class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		int dup = num, len = 0, sum = 0;
		
		for (int i= num;i>0 ;i/=10 )
				len++;
			
			while (num>0)
			{
				int rem = num%10;
				int pow = 1;
				for (int j = 1;j<=len ;j++ )
				{
					pow *= rem;
				}
				sum += pow;
				num/=10;
			}
			System.out.print(
				dup==sum?dup+" is a Armstrong number"
				        :dup+" is not an armstrong number");
	}
}
