package Encapsulation;

public class BankAccount {
  
		
		private String username;
		private String bank = "ICICI BANK";
		private long accno;
		private String ifsc;
		private double balance;
		private int pin;
		
		
		BankAccount(String name, long accno, String ifsc, double balance, int pin){
			
			username = name;
			this.accno = accno;
			this.ifsc = ifsc;
			this.balance = balance;
			this.pin = pin;
		}
		
		public String getName() {
			return username;
		}
		
		public long getAccno() {
			return accno;
		}
		public String getIfsc() {
			return ifsc;
		}
		
		public double getBalance() {
			return balance;
		}
		
		public void credit(long accno, double amt) {
			
			if(this.accno == accno) {
				
			   if   (amt>1) {
		
					balance += amt;
					System.out.println("Amount Credited ...!");
				}
				else
					System.out.println("Invalid Amount");
				
			}
			else {
				System.out.println("Invalid Acoount number ");
			}
		}
		public void debit (long accno, double amt, int pin) {
			if (this.accno == accno && this.pin == pin) {
				
				if (amt>1000) {
					
					balance -= amt;
					System.out.println(" Amount Debited ");
				} else {
					System.out.println(" Invalid Amount");
				}
			} else {
				System.out.println("Invalid credentials");
			}
		}
		
		public void setPin(long accno , int oldPin, int newPin) {
			
			if (this.accno == accno && this.pin ==  oldPin) {
				
				this.pin = newPin;
				System.out.println("Pin updated.!");
			} else {
				System.out.println("Invalid credentials");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}
