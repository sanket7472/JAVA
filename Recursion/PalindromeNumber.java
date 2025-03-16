import java.util.Scanner;
class PalindromeNumber 
{// this program helps to find palindrome number
	public static void main(String[] args) 
	{
		System.out.print("Enter number :");
		int num = new Scanner(System.in).nextInt();
		if (isPalindrome(num))
		{
			System.out.print(num + " is a palindrome number");
			return;
		}
		System.out.print(" is not palindrome number ");
	}
	public static boolean isPalindrome(int num)
	{
		int rev = reverse(num , 0);
		return num == rev ?true : false;
	}
	public static int reverse(int num , int rev )
	{
		return num == 0 ? rev : reverse (num/10 , (rev*10)+(num%10));
	}
}
