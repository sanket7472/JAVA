import java.util.Scanner;
class Fibonacci 
{
	public static void main(String[] args) 
	{
		System.out.print("How many numbers you want to print : ");
		int range = new Scanner(System.in).nextInt();
		System.out.println("Printing first "+range+" numbers : ");
		int n0 = 0;
		int n1 = 1;
		System.out.print(n0 +" " +n1 +" ");
		for (int i = 2;i<range ; i++ )
		{
			int n = n0 + n1;
			System.out.print(n +" ");
			n0 = n1;
			n1 = n;
		}
	}
}
