package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numerator=0;
		int denominator = 0;
		
		while (true) {
			try {
				System.out.println("Enter Numerator : ");
				 numerator = sc.nextInt();
			
				
			
				System.out.println("Enter denominator : ");
				denominator = sc.nextInt();
				sc.close();
				
				int ans = numerator/denominator;
				System.out.println(ans);
			}
			catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("Only int data is allowed ");
			} 
			catch (ArithmeticException e) {
				System.out.println("Cant divide by zero");
			}
			catch (Throwable e) {
				System.exit(0);
			}
			
			finally {
				System.out.println("Thank you.....!");
				
			}
		}
		
	}
}
