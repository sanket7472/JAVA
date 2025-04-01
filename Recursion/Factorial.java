import java.util.Scanner;
class Factorial{
	//finding factorial of a number using recursive way
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		System.out.print(fact(num));
	}
	public static int fact(int num)
	{
		// normal way
		/*
		if (num == 1) {
			return 1;
		}
		return num * fact(num-1);
		*/

		// optimize way 
		return num==1 ? 1 : num * fact(num-1);
	}
}
