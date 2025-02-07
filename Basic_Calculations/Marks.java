import java.util.Scanner;
class Marks 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter marks(out off 600) :");
		short marks = new Scanner(System.in).nextShort();

		float percentage = (marks/600f)*100f;
		System.out.println(percentage);

		System.out.println((marks>600 || marks<0)?("Invalid Marks"):
			(percentage>=75f)?("Pass with grade A "):
			(percentage<75f&&percentage>=60f)?("Pass with grade B"):
			(percentage<60f&&percentage>=35f)?("Pass with grade C"):("Failed"));
	}
}
