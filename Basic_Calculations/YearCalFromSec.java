import java.util.Scanner;
class YearCalFromSec 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter seconds to find years :");
		long totalMinutes = new Scanner(System.in).nextLong();//1000000000l
		//System.out.println(totalMinutes);
		long minInYear = (365*24*60);
		long years = totalMinutes/minInYear;
		//long minRemains = totalMinutes % minInYear;
		long minInDay = (24*60);
		long days = (totalMinutes % minInYear)/minInDay;
		System.out.println(years + "   Years   "+ days+ "  days.");




	}
}
