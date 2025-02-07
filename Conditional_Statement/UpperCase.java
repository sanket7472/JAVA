import java.util.Scanner;
class UpperCase 
{
	public static void main(String[] args) 
	{   System.out.println("Enter Charecter :  ");
		char ch =new Scanner(System.in).next().charAt(0);

		String op = ((ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')?
					((ch>='a'&&ch<='z')?(ch + "  is a LowerCase Alphabet"):(ch + "  is a UpperCase Alphabet")):

					((ch>='0'&&ch<='9')?(ch + "  is a Digit"):(ch + "   is a Special Charecter")));

			System.out.println(op);
	}
}
