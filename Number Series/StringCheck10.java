import java.util.Scanner;
class StringCheck10
{
	public static void main(String[] args) 
	{
		int cnt0 =0, cnt1 =0;
		System.out.print("Enter number : ");
		String str = new Scanner(System.in).next();
		int len = str.length();
		for (int i = 0;i<len ;i++ )
		{
			if (str.charAt(i)=='0')
			{
				cnt1++;
				cnt0 = 0;
			}
			else if (str.charAt(i)=='1')
			{
				cnt0 = 0;
				cnt1++;
			}
			if (cnt0>6||cnt1>6)
			{
				break;
			}
			
		}
		System.out.print(
			(cnt0>6||cnt1>6? "Yes":"NO"));
		
	}
}