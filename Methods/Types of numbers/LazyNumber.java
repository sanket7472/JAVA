import java.util.Scanner;
class LazyNumber
// Lazy Caterer's Sequence
{
	//R(n)= ((n*n+1)/2 )+1

	public static void main(String[] args) 
	{
		System.out.println();
		System.out.print("Enter how many number you want to print from Lazy Caterer's Sequence : ");
		int num = new Scanner(System.in).nextInt();
		lazy(num);
	}
	public static void lazy(int n)
	{
		int ct = 1;
		for (int i = 0; i<=n ;i++ )
		{
			System.out.print(((i*(i+1))/2)+1 +"  ");
			
		}
	}
}
