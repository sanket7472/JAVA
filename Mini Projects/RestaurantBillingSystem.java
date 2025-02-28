import java.util.Scanner;
class RestaurantBillingSystem  {
	
	static Scanner sc = new Scanner(System.in);
	static String name = "";
	static String pass = "";
	public static void main(String[] args) {
		 for (; ; ) {
		 	System.out.println("\n       --->WELCOME<---");
        	System.out.println("       	HOTEL ADITYA ");
			System.out.println("***********************************");
		 	System.out.println("\n 1. CREATE ACCOUNT");
        	System.out.println("\n 2.  LOGIN ");
        	System.out.print("\n Enter an option :");
        	int opt = sc.nextInt();
        	System.out.println();
        	switch (opt) {
        		case 1 : createAccount();break;
        		case 2 : login(); break;
        		default : System.out.println(" Enter valid option");
        	}
		 }

	}
	public static void createAccount()
	{
		System.out.println("     REGISTRATION");
		System.out.println();
		System.out.print(" user name : ");
		name = sc.next();
		System.out.print(" password : ");
		pass = sc.next();
		System.out.print(" Address : ");
		String address = sc.next();
		System.out.println();
		System.out.println(" ACCOUNT CREATED SUCCESSFULLY");
	}
	public static void login()
	{
		for (int i = 3;i>=1 ;i-- ) {
			if (name.equals("")) {
				System.out.println(" Please Create account First ...");
				break;
			}
			System.out.print("username : ");
			String username = sc.next();
			System.out.print(" Password : ");
			String password = sc.next();
			if (name.equals(username)&&pass.equals(password)) {
				homepage();
			}
			else
			{
				System.out.println("Invalid Credentials. ");
				System.out.println(" Attempts left -> "+ (i-1));
			}
			if (i==1) {
					System.out.println("Thanku for Visiting.");
					System.exit(0);
			}

		}
	
	}

	public static void homepage()
	{
		for (; ; ) {
			
		System.out.println(" 1. Menu ");
		System.out.println(" 2. Order ");
		System.out.println(" 3. Bill ");
		System.out.println(" 4. Logout ");
		System.out.print(" Choose Option : ");
		int opt = sc.nextInt();

		switch (opt) {
			case 1 : menu();break;
			case 2 : orders();break;
			case 3 : bill();break;
			case 4 : System.exit(0);
			default : System.out.println("Invalid Option "); break;
		}
		}
	}
	public static void menu()
	{
		System.out.println("menu");

	}
	public static void orders()
	{
		System.out.println("orders");
		
	}
	public static void bill()
	{
		System.out.println("bill");
		
	}

}