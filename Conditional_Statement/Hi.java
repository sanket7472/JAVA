import java.util.Scanner;
class  Hi
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a number : ");
		int num = new Scanner(System.in).nextInt();
		System.out.println(
			(num%2==0&&num%5==0)?("HiTwo  HiFive"):((num%2==0)?("HiTwo"):((num%5==0)?("HiFive"):("Blank")))
			);

	}
}
