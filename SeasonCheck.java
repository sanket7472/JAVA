import java.util.Scanner;
class SeasonCheck 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Month : ");
		String month = new Scanner(System.in)
			.nextLine().toUpperCase();
		String op = (month.equals("FEB") ||month.equals("MAR") ||month.equals("APR") || month.equals("MAY"))?("SUMMER"):
			((month.equals("JUN") ||month.equals("JUL") ||month.equals("AUG") || month.equals("SEP")?("MONSOON "):
			(month.equals("OCT") ||month.equals("NOV") ||month.equals("DEC") || month.equals("JAN"))?("WINTER"):("Invalid Input")));
		System.out.println(op);
	}
}
