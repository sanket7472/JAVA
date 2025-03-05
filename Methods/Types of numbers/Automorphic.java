import java.util.Scanner;
class Automorphic {
	public static void main(String[] args) {
		System.out.print("Enter num : ");
		int num = new Scanner(System.in).nextInt();

		if (automorphic(num)) {
			System.out.println(" Automorphic Number");
		}
		else
			System.out.println("Not an Automorphic Number");
	}
	public static boolean automorphic(int num)
	{

		int div = 1;
		for (int i = num;i>0 ;i/=10 )
		{
			div *=10;
		}
		return (num==((num*num)%div));
	}
}