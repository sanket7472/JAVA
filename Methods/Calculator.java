import java.util.Scanner;
class Calculator {

	// method perform addition operation
	public static void add(int a , int b) {
		System.out.println("Addition is "+a +" and "+b+" is : "+(a+b));
	}
	// method perform substraction operation
	public static void substract(int a , int b) {
		System.out.println("Substraction of "+a +" and "+b+" is : "+(a-b));
	}
	// method perform multiplition operation
	public static void multiply(int a , int b) {
		System.out.println("Multiplication of "+a +" and "+b+" is : "+(a*b));
	}
	// method perform division operation
	public static void division(int a , int b) {
		System.out.println("Division of "+a +" divide by "+b+" is : "+(a/b));
	}
	// method perform modulus operation
	public static void modulus(int a , int b) {
		System.out.println("Modulus of "+a +" mod by "+b+" is : "+(a%b));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----> WELCOME <-----");
		Home : 
		for (; ; ) {
		
			System.out.println(" Which operation you want to perform : ");
	
		System.out.println();
		System.out.println(" 1. Addition ");
		System.out.println(" 2. Substraction ");
		System.out.println(" 3. Multiplition ");
		System.out.println(" 4. Division ");
		System.out.println(" 5. Modulus ");
		System.out.print(" Enter Option : ");
		int opt = sc.nextInt();
		System.out.println();

		System.out.print("Enter first number :");
		int num1 = sc.nextInt();
		System.out.print("Enter Second number :");
		int num2 = sc.nextInt();

		switch(opt){
			case 1 : add(num1 , num2);break;
			case 2 : substract(num1 , num2);break;
			case 3 : multiply(num1 , num2);break;
			case 4 : division(num1 , num2);break;
			case 5 : modulus(num1 , num2);break;
			default : 
				System.out.println(" Please enter valid option : ");
		}
		
	 
		for (; ; ) {
			
		System.out.print(" Do you want to perform more operation (y/n) : ");
		String ch = sc.next().toLowerCase();
		if (ch.equals("n") || ch.equals("no")) {
			break Home;
		}
		else if (ch.equals("y") || ch.equals("yes")) {
			continue Home ;
		}
		else 
		{
			System.out.println(" Enter valid option");
			continue ;
		}
		}
	
		
	
		}

	}
}