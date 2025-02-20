import java.util.Scanner;
class DuckNumber 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter Number :");
		int num = new Scanner(System.in).nextInt();      //12304;
		String str = num +"";

		// logic 1st 
		// using contains method
		
			if (str.contains("0")&&str.charAt(0)!='0')
		{
			System.out.print(num+" is a Duck number ");
		}
		else 
			System.out.print(num +" is not a Duck number");
		System.out.println();
		

		// logic 2nd 
		// using loop
		if (str.charAt(0)!='0')
		{
			boolean flag = false;
			for (int i = 1;i<str.length() ;i++)
			{
				if (str.charAt(i)=='0')
				{
					flag = true;
					System.out.print(num+" is Duck number");
				}
				
			}
			if (!flag)
			{
				System.out.print(num +"is not a Duck number");
			}
			
		}
		else
				System.out.print(num +"is not a Duck number");
	}
}
