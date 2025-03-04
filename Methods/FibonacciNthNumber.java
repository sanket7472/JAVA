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
		if (num==1) {
			return 0;
		}
		int snum = 1;
		if (num==2||num==3) {
			return 1;
		}
		int nxtnum=0;
		
		for (int i = 3;i<=num ;i++ )
		{
			nxtnum = fnum+snum;
			fnum = snum;
			snum = nxtnum;
		}
		return nxtnum ;
	}
}