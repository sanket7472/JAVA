import java.util.Scanner;
class BuzzNumberFromRange {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Start : ");
		int start = sc.nextInt();
		System.out.print(" Enter End : ");
		int end = sc.nextInt();

		while (start <= end) 
		{
			if (isBuzz(start)) 
			{
				System.out.print(start + "  ");
			}
			start++;
		}

	}
	public static boolean isBuzz(int num)
	{
		if (num%7==0||num%10==7) {
			return true;
		}
		return false;
	}
}