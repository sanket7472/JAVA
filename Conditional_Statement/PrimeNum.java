import java.util.Scanner;
class  PrimeNum
{
	public static void main(String[] args) 
	{
		System.out.print("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		System.out.println(
			((num==2||num==3||num==5))?(num +" is Prime"):
			((num%2==0||num%3==0||num%5==0)?(num + " is not a prime"):
			(num + "is prime"))
		);
	}
}
