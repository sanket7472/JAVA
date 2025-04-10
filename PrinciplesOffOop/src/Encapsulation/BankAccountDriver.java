package Encapsulation;

public class BankAccountDriver {

	public static void main(String[] args) {
		
		BankAccount b1 = new BankAccount("Sanket", 123465789l, "SBIN000123", 2000, 1234);
		
		System.out.println(b1.getBalance());
		b1.credit(123465789l, 10000);
		System.out.println(b1.getBalance());
		BankAccount b2 = new BankAccount("Sanket", 123465789l, "SBIN000123", 2000, 1234);
		
	}
}
