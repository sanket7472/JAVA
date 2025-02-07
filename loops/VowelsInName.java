import java.util.Scanner;
class VowelsInName 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter your name : ");
		String name = sc.next().toLowerCase();
		int cnt = 0;
		for (int i = 0;i<(name.length()) ;i++ )
		{
			if ((name.charAt(i)=='a')||(name.charAt(i)=='e')||(name.charAt(i)=='i')||(name.charAt(i)=='o')||(name.charAt(i)=='u'))
			{
				cnt++;
				System.out.print((name.charAt(i) + "  "));
			}
			
		}
		System.out.println();
		if (cnt !=0)
		{
			System.out.println("Total Vowels in your name : "+ cnt);
		}
		else 
		{
			System.out.print( " No Vowels Found in your name.");
		}
	}
}
