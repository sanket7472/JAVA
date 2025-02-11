import java.util.Scanner;
class PasswordCheck
{
	public static void main(String[] args) throws InterruptedException
	{
		
		int storePass = 1234;
		int attempt = 3;
		int seconds = 5000;
		outerloop:
		for (; ; )
		{
			do
			{
				System.out.print(" \n Enter Password : ");
				int userPass = new Scanner(System.in).nextInt();
				if (userPass == storePass)
				{
					System.out.print("Phone unlocked....");
					break outerloop;
				}
				else
				{
					System.out.println("WRONG PASSWORD ");
					System.out.println("Attempt left "+ (attempt-1));
					
				}
				attempt--;
			}
			while (attempt>=1);
		
			System.out.print(" \n phone is disable for "+(seconds/1000)+" seconds");
			Thread.sleep(seconds);
			seconds *= 2;
			attempt=3;
		}
	}
}
