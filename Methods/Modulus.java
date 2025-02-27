import java.util.Scanner;
class Modulus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("***WELCOME***");
		System.out.print("Enter first number : ");
		int num1 = sc.nextInt();
		System.out.println();
		System.out.print("Enter Second nnumber : ");
		int num2 = sc.nextInt();
		modulus(num1,num2);
	}

	public static void modulus(int a , int b) {
		System.out.println("Modulus of "+a +" mod by "+b+" is : "+(a%b));
	}
}