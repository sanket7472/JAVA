import java.util.Scanner;
class CurrencyConvertor {

	public static void rupeeToDollar(double rup){
		double dollar = rup / 87.15;
		System.out.println(rup +" is in dollar are :"+dollar + " USD");
		dollarToEuro(dollar);
	}
	public static void dollarToEuro(double dollar){
		double euro = dollar * 0.95;
		System.out.println(dollar +" is in Euro are :"+euro + " EUR");
		euroToDirham(euro);
	}
	public static void euroToDirham(double euro){
		double dirham = euro * 3.85;
		System.out.println(euro +" is in dirham are :"+dirham + " UAED");

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount in INR : ");
		double amt = sc.nextDouble();
		rupeeToDollar(amt);
	}
	
}