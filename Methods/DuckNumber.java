import java.util.Scanner;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number :");
		int num = new Scanner(System.in).nextInt();      //12304;
		String str = num +"";
		if (duck(str)) {
			System.out.print(num+" is a Duck Number");
		}
	}
	public static boolean duck(String str)
	{
		if (str.contains("0")&&str.charAt(0)!='0')
		{
			return true;
		}
		return false;
			
	}
}