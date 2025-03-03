import java.util.Scanner;
class Fibonacci {
	public static void main(String[] args) {
		System.out.print("Enter how many numbers you want to print from fibonacci series :");
		int num = new Scanner(System.in).nextInt();
		fibonacii(num);
	}
	public static void fibonacii(int num )
	{
		int fnum = 0;
		System.out.print(fnum +"  ");
		int snum = 1;
		System.out.print(snum +"  ");
		for (int i = 2;i<num ;i++ ) {
			int nxtnum = fnum+snum;
			System.out.print(nxtnum +"  ");
			fnum = snum;
			snum = nxtnum;
		}
	}
}