import java.util.Scanner;
class FibonacciFromRange {
	// fibonacii number series will generate from user entered start to till the user entered end  
	// if user entered 1 and  10 ----> program will generate and print number
	// between 1 to 10 from fibonacii series.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Start :");
		int start = sc.nextInt();
		System.out.print("Enter end :");
		int end = sc.nextInt();
		fibonacii(start,end);
	}
	public static void fibonacii(int start ,int end )
	{
		int fnum = 0;
		int snum = 1;
		do 
		{  
			if (fnum>=start) {
				System.out.print(fnum +"  ");
			}
			int nxtnum = fnum + snum;
			fnum = snum;
			snum = nxtnum;
		}while(fnum<=end);
		
	
	}
}