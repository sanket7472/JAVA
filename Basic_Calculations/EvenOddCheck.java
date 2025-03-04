import java.util.Scanner;
class EvenOddCheck {
	/*
		even or odd check without % .
		without if else 
		without switch
	*/
	public static void main(String[] args) {
		System.out.print("Enter number : ");
		int num = new Scanner (System.in).nextInt();
		System.out.print(evenOddCheck(num));
	}
	public static String evenOddCheck(int num)
	{
		if ((num/2)*2 == num) {
			return num+ " is even .";
		}
		return num+ " is odd .";
	}
}