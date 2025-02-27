import java.util.Scanner;
class Bank 
{
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		String username = null;
		String password = null;
		double deposite = 0;
		double withdraw = 0;
		double balance = 0;

        for (  ;   ;  )
        {
   
        System.out.println("\n       --->WELCOME<---");
        System.out.println("       SHREE COPERATIVE BANK ");
		 System.out.println("***********************************");
        System.out.println("\n \n 1. PLEASE LOGIN ");
        System.out.println("\n 2. CREATE ACCOUNT");
        System.out.print("\n Please Chhose an option :");
        int opt = sc.nextInt();

		

        if (opt==1)
			{
			if (username == null)
			{
				System.out.println(" \n Create account for Login... ");
				continue;
			}
			for (int i = 3;1>0 ;i-- )
			{
			
            System.out.print("\n ENTER USERNAME :");
			String username2 = sc.next();
			System.out.print("\n ENTER PASSWORD :");
			String password2 = sc.next();
			
			if (username2.equals(username) && password2.equals(password))
			{
				Home :
				for (  ;  ;  )
				{  
 
					System.out.println(" \n HOME ");
					System.out.println(" \n 1. Deposit  ");
					System.out.println(" \n 2. Withdraw ");
					System.out.println(" \n 3. Check Balance ");
					System.out.println(" \n 4. Mini Statement  ");
					System.out.println(" \n 5. Logout ");
					System.out.println(" \n \n Enter the option : ");
					int opt2 = sc.nextInt();
					switch (opt2)
					{
					case 1:
						{
						// deposite
							System.out.println(" \n Enter Amount to deposite :  ");
							deposite = sc.nextDouble();
							balance += deposite; 
							System.out.println(" \n Deposite Successfull.. ");
							continue Home;
						
						}
					case 2:
						{
							//withdraw

							System.out.println(" \n Enter amount to be Withdraw :  ");
							withdraw = sc.nextDouble();
							for (int j=3;j>0 ; j--)
							{
								System.out.println(" \n Enter PIN :");
								String pin = sc.next();
								if (pin.equals(password))
								{
									if (withdraw<balance)
									{
										balance -= withdraw;
										System.out.print ("\n Amount Debited...");
											continue Home;
									}
									else
									{
										System.out.print ("\n Inuficient Balance ..");
									}
								}
								else 
								{
									if ((j-1)==0)
									{
										System.out.println(" \n wrong credentials...");
										System.exit(0);
						
									}
									else
										{
											System.out.println(" \n Wrong PIN...");
											System.out.println(" \n Atempt left : "+ (i-1));
										}
								
								}
								break;
							}
							
							
							
						}
					case 3:
						{
						for ( int k=3;k>0 ;k-- )
						{
							System.out.println(" \n Enter PIN :");
								String pin1 = sc.next();
								if (pin1.equals(password))
								{
									System.out.println(" \n Your Account Balance is : " + balance);
									continue Home;
								}
								else 
							{
									if ((k-1)==0)
									{
										System.out.println(" \n To many attempts .. \n Try After 2 Hours");
									}
									else
								{
									System.out.println(" \n Re-Enter PIN : \n " + (k-1) +"Attempt left");
								}
						
							
							}
							continue Home;
							
							
						}
							
						}
					case 4:
						{
							//mini statement
							System.out.println("mini statement");
							continue Home;
						
						}
					case 5:
						{
							System.exit(0);

						}
					}

				}
				

			}
			else
			{
				if ((i-1)==0)
				{
					System.out.println(" \n Dont try to login with wrong credentials..  ");
					System.exit(0);
				}
				else
				{
				System.out.println(" \n Wrong Credentials...");
				System.out.println(" \n Atempt left : "+ (i-1));
				}
			}
			}
			
        }
        else if (opt==2)
        {
            System.out.println(" CREATE ACCOUNT ");
			System.out.print("\n ENTER USERNAME :");
			username = sc.next();
			System.out.print("\n ENTER PASSWORD :");
			password = sc.next(); 
			System.out.print("\n ENTER MOBILE NUMBER :");
			long number = sc.nextLong();
			System.out.print("\n ENTER YOUR ADDRESS : ");
			String address = sc.next();
			System.out.print("Deposite : ");
			balance = sc.nextDouble();
			System.out.println("\n ACCOUNT CREATED SUCCESSFULLY...");
        }
        else 
        {
            System.out.println("Invalid Option...");
        }

		
        }
    }
}
