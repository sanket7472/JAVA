import java.util.Scanner;
class  Voual
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a Character :  ");
		char ch = new Scanner(System.in).next().charAt(0);
		System.out.println(
			(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')?(ch+ "  is a Voual"):(ch+"  is a Consonent"));
	}
}
