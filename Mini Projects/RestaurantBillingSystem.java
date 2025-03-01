import java.util.*;
class RestaurantBillingSystem  {
	
	static ArrayList<String> basket = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	static String name = "";
	static String pass = "";
	public static void main(String[] args) {
		 for (; ; ) {
		 	System.out.println("\n       --->WELCOME<---");
        	System.out.println("       	HOTEL ADITYA ");
			System.out.println("***********************************");
			homepage();
		 /*	System.out.println("\n 1. CREATE ACCOUNT");
        	System.out.println("\n 2.  LOGIN ");
        	System.out.print("\n Enter an option :");
        	int opt = sc.nextInt();
        	System.out.println();
        	switch (opt) {
        		case 1 : createAccount();break;
        		case 2 : login(); break;
        		default : System.out.println(" Enter valid option");
        	}*/
		 }

	}
	/*public static void createAccount()
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
	
	}*/

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
		System.out.println("    Menu");
		System.out.println("101  Paneer_Masala    450");
		System.out.println("102  Paneer_Chili     450");
		System.out.println("103  Butter_Paneer    450");
		System.out.println("104  Palak_Paneer     450");
		System.out.println("105  Paneer_Angara    450");
		System.out.println("106  Mix_veg          450");
		System.out.println("107  Matar_Paneer     450");
		System.out.println("108  Veg_Kolhapuri    450");
		System.out.println("109  Sp.Shev_Bhaji    450");
		System.out.println("110  Aditya's_Sp.Thali    450");
		System.out.println("111  Exit Menu");

		System.out.println();
		for (; ; ) {
			
		
		System.out.println("Enter FoodId : ");
		int opt = sc.nextInt();
		switch (opt) {
		 	case 101 : {
		 		basket.add("101 : Paneer_Masala - 450");
		 		itemAdd();
		 		break;
		 	}
		 	case 102 : {
		 		basket.add("102 : Paneer_Chili - 450");
		 		itemAdd();
		 		break;
		 	}
			case 103 : {
		 		basket.add("103 : Butter_Paneer - 450");
		 		itemAdd();
		 		break;
		 	}
			case 104 : {
		 		basket.add("104 : Palak_Paneer - 450");
		 		itemAdd();
		 		break;
		 	}
		 	case 105 : {
		 		basket.add("105 : Paneer_Angara - 450");
		 		itemAdd();
		 		break;
		 	}
		 	case 106 : {
		 		basket.add("106 : Mix_veg - 450");
		 		itemAdd();
		 		break;
		 	}

		 	case 107 : {
		 		basket.add("107 : Matar_Paneer - 450");
		 		itemAdd();
		 		break;
		 	}
		 	case 108 : {
		 		basket.add("108 Veg_Kolhapuri    450");
		 		itemAdd();
		 		break;
		 	}
		 	case 109 : {
		 		basket.add("109 : Sp.Shev_Bhaji - 450");
		 		itemAdd();
		 		break;
		 	}
		 	case 110 : {
		 		basket.add("110 : Aditya's_Sp.Thali - 450");
		 		itemAdd();
		 		break;
		 	}
			case 111 : {
					return;
			}
		 	default:
		 		System.out.println("Dish not Available ");
		 		return ; 
			
		}

		}
	}
	public static void orders()
	{
		System.out.println();
		System.out.println();
		System.out.println("Your Orders");
		if (basket.size()==0) {
			System.out.println(" Basket is empty , Please Select some items from Menu");
		}
		else
		{
			for ( String foodItem : basket ) {
				System.out.println(foodItem);
			}
		}
		System.out.println();
		System.out.println();
		System.out.println(" 1. Cancel Order");
		System.out.println(" 2. Delete Food Items");
		System.out.println(" 3. Proceed to Payment");
		System.out.println();
		System.out.print(" Chose Option  :");
		int opt = sc.nextInt();
		System.out.println();
		switch (opt) {
			case 1 : {
				basket.clear();
				System.out.println(" Order Canceled..!");
				return;
			}
		case 2 : {
			System.out.println(" Enter foodId : ");
			int foodId = sc.nextInt();
			removeItem(foodId);
			break;
		}
		case 3 : {
			payment();
			break;
		}
		default:
			System.out.println("Invalid Option ...!");
			break;

		}


	}
	public static void bill()
	{
		System.out.println("bill");
	}
	public static void itemAdd()
	{
		System.out.println(" Item added to basket");
	}

	public static void removeItem(int foodId)
	{
		ArrayList<String> dupBasket = new ArrayList<>(basket);
		int index = 0;
		boolean flag = false;
		for (String foodItem : dupBasket ) {
			 
			 String [] arr = foodItem.split(" ");
			 if (arr[0].equals(foodId+"")) {
			 	dupBasket.remove(index);
			 	flag = true;
			 	System.out.println("Item Deleted ");
			 }
			 
			 index++;


		}
		if (!flag) {
			System.out.println("Food Item not in the basket .. !");
			System.out.println();
		}
		basket = dupBasket;

	}
	public static void payment()
	{
		double totalBill = 0;
		for (String foodItem : basket ) {
			 
			String [] arr = foodItem.split(" ");
			
			totalBill += Double.parseDouble(arr[4]);
			System.out.println("Your total bill Amount : "+totalBill);
		}
	}
}