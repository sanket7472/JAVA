import java.util.Scanner;
class Loancalc 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("         EMI CALCULATOR ");
		System.out.println();
		System.out.print("Enter the Loan Amount :");
		System.out.println();
		float amt = sc.nextFloat();


		System.out.println();

		System.out.print("Enter the ROI :");
		float roi = sc.nextFloat();
		System.out.println();
		System.out.print("Enter the Tenure (months):");
		float months = sc.nextFloat();
		System.out.println();

		float intrest = (amt*roi)/100f;
		float totalAmt = amt + intrest;

		System.out.println();
		float emi = totalAmt/months;

		System.out.println();
		System.out.println("Total Loan amount is :"+ totalAmt);
		System.out.println("Total Intrest applied is :"+ intrest);
		System.out.println("Emi per month is :"+emi);

		
	}
}
