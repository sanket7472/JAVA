import java.util.Scanner;
class FibonacciNthNumber {
	public static void main(String[] args) {
		System.out.print("Enter the position :");
		int position = new Scanner(System.in).nextInt();
		System.out.print("Number in Fibonacii Series at "+position+"th position is "+nthNumFromFibonacii(position));
	}
	public static int nthNumFromFibonacii(int num)
	{
		int fnum = 0;
		int snum = 1;
		for (int i = 1;i<num ;i++ )
		{
			int nxtnum = fnum+snum;
			fnum = snum;
			snum = nxtnum;
		}
		return fnum ;
	}
}