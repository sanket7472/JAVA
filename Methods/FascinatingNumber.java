import java.util.Scanner;
class FascinatingNumber 
{
	// fascinating number check using string
	public static void main(String[] args) 
	{
		System.out.print("Enter Number : ");
		int num = new Scanner(System.in).nextInt();
		if (isFascinating(num)) {
			System.out.print(num+" is a Fascinating Number");
		}
		else 
			System.out.print(num +" is not a Fascinating Number");
	}
	public static boolean isFascinating(int num)
	{
		String numstr = num + ""+num*2+"" +num*3;
		for (char i = '1';i<='9' ;i++ )
		{
			int cnt = 0;
			for (int j = 0;j<numstr.length() ;j++ )
			{
				char ch = numstr.charAt(j);
				if (ch==i)
				{
					cnt++;
				}
			}
			if (cnt!=1)
				{
					return false;
				}
		}
		return true;
	}
}
