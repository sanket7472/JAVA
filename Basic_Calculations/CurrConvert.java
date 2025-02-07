import java.util.Scanner;
class CurrConvert 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("         Currency Converter :");
		System.out.println();
		System.out.println("Enter the amount(INR) : ");
		float inr = sc.nextFloat();
		System.out.println();

		System.out.println("LIST OF CURRENCY");
		System.out.println();
		System.out.println("1. USD");
		System.out.println("2. EUR");
		System.out.println("3. GBP");
		System.out.println("4. PKR");
		System.out.println("5. KWD");
		System.out.println();
		System.out.println("Enter the Currency you want to convert :");
		String curr = sc.next().toUpperCase();
		float convert = 0;

		if (curr.equals("USD"))
		{
			convert = inr/86.56f;
			System.out.println(inr +"INR = "+ convert + "  USD");
		}
		else if (curr.equals("EUR"))
		{
			convert = inr/90.27f;
			System.out.println(inr +"INR = "+ convert + "  EUR");
		}
			else if (curr.equals("GBP"))
		{
			convert = inr/107.66f;
			System.out.println(inr +"INR = "+ convert + "  GBP");
		}
			else if (curr.equals("PKR"))
		{
			convert = inr/0.31f;
			System.out.println(inr +"INR = "+ convert + "  PKR");
		}
			else if (curr.equals("KWD"))
		{
			convert = inr/0.31f;
			System.out.println(inr +"INR = "+ convert + "  KWD");
		}
			else 
		{
			
			System.out.println(" INVALID CURRENCY NAME");
		}
	}
}
