import java.util.Scanner;
class Factorial{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		System.out.print(fact(num));
	}
	public static int fact(int num)
	{
		if (num == 1) {
			return 1;
		}
		return num * fact(num-1);
	}
}