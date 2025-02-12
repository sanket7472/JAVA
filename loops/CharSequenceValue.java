import java.util.Scanner;
class CharSequenceValue 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter character (max-2) : ");
		String str = new Scanner(System.in).next().toUpperCase();
		int len = str.length();
		int value = 0;
		for (int i = 0;i<len ;i++ ){
				if (str.charAt(i)<'A'||str.charAt(i)>'Z')
					System.out.print("Only A-Z char is allowed ");
			System.exit(0);
		}
		if (len==1)
		{
			value = str.charAt(0)-64;
			System.out.print(value);
		}
		else if (len==2)
		{
			value = ((str.charAt(0)-64)*26)+(str.charAt(1)-64);
			System.out.print(value);
		}
	}
}
