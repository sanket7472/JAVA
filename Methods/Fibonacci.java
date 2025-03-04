import java.util.Scanner;
class Fibonacci {
	// fibonacii number series generated from 0 to till the user entered count 
	// if user entered 10 ----> program will generate first 10 fibonacii number will printed.
	public static void main(String[] args) {
		System.out.print("Enter how many numbers you want to print from fibonacci series :");
		int num = new Scanner(System.in).nextInt();
		fibonacii(num);
	}
	public static void fibonacii(int num)
	{
		int fnum = 0;
		int snum = 1;
		for (int i = 0;i<num ;i++ )
		{
			int nxtnum = fnum+snum;
			System.out.print(fnum +"  ");
			fnum = snum;
			snum = nxtnum;
		}
	}
}