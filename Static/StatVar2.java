class StatVar2 
{
	// learning the execution of static variable through out the class block
	static double balance;
	public static void main(String[] args) 
	{
		credit(1000);
		debit(500);
	}
	public static void credit(int amt)
	{
		if (amt>0)
		{
			balance += amt;
			System.out.println("Amount Credited ");
			System.out.print("Total account balance is "+balance);
		}
		else
			System.out.println("Invalid amount ");
	}
		public static void debit(int amt)
	{
		if (amt>0 && balance>=amt)
		{
			balance -= amt;
			System.out.println("Amount Debited ");
			System.out.print("Total account balance is "+balance);
		}
		else
			System.out.println("Invalid amount ");
	}
}
