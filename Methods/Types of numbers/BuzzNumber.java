import java.util.Scanner;
class BuzzNumber {
	public static void main(String[] args) {
		System.out.print(" Enter Number ;");
		int num = new Scanner(System.in).nextInt();
		if (isBuzz(num)) {
			System.out.print(" Buzz Number");
		}
		else
			System.out.print("Not Buzz number");
	}
	public static boolean isBuzz(int num)
	{
		if (num%7==0||num%10==7) {
			return true;
		}
		return false;
	}
}