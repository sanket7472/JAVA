import java.util.Scanner;
class FinancialCalc
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Bill Amount : ");
		float subtotal = sc.nextFloat();
		System.out.print("Enter the Tip Rate : ");
		float tipRate = sc.nextFloat();
		float tipAmount = (subtotal*tipRate)/100;
		float finalAmount = subtotal+ tipAmount;
		System.out.print("Total Bill Amount is : " + finalAmount);
		System.out.println("Tip Added : " + tipAmount);
	}
}
