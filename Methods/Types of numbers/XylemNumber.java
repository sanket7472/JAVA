import java.util.Scanner;
class XylemNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter num : ");
		int num = new Scanner(System.in).nextInt();
		if (isXylem(num ))
		{
			System.out.print(num + " is an Xylem number ");
			return;
		}
		System.out.print(num + " is not an Phloem number ");
	}
	public static boolean isXylem(int num)
	{
		int sumOfExternal = num%10;
		int sumOfMiddle = 0;
		num/=10;
		while (num>9)
		{
			sumOfMiddle += (num%10);
			num/=10;
		}
		sumOfExternal += num;

		return sumOfMiddle == sumOfExternal;
	}
}
