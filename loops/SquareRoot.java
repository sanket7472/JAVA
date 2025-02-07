import java.util.Scanner;
class SquareRoot 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();

		int sqrt = 0;
		for (int i=1;i<=(num/2) ;i++ )
			// we can use math.sqrt() function 
		{
			if ((i*i)==num)
			{
				sqrt=i;
				System.out.print(sqrt + " is a square root of "+num);
				break;
			}
			if ((i*i)>num)
						break;
			
		}
		if (sqrt==0)
		{
			System.out.print(num + " Dont have a perfect Square root.");
		}
	}
}
