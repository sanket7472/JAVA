import java.util.Scanner;
class PalindromeString 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter name : ");
		String str = new Scanner(System.in).next();
		String rev = "";

		for (int i=0; i<str.length() ;i++ )
		{
			rev = str.charAt(i) + rev;
		}
			System.out.print("Original Name : "+str +"Reverse Name : "+rev);
		if (str.equals(rev))
			System.out.println("\n Name is a Palindrome String.");
		else
		System.out.println("\n Name is not a palindrome string.");

	}
}
