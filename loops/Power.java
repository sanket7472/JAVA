import java.util.Scanner;
class Power 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.print("Enter power : ");
		int pow = sc.nextInt();
		int op = 1;
		for (int i=1; i<=pow ;i++ )
		{
			op *=num;
		}
		System.out.print(num+"^"+pow+"= "+ op);

	}
}
