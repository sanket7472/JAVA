import java.util.Scanner;
class PythagoreanTriplets 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first :");
		int a = sc.nextInt();
		System.out.print("Enter second : ");
		int b = sc.nextInt();
		System.out.print("Enter third : ");
		int c = sc.nextInt();
		if (pythagorean(a,b,c))
		{
			System.out.println("It is a Pythagorean Triplets");
		}
	}
	public static boolean pythagorean(int a , int b , int c)
	{
		return (a*a)+(b*b) == (c*c) ? true : false ;
	}
}
