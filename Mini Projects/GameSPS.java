import java.util.Scanner;
class GameSPS 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("------------> WELCOME<------------");
		System.out.println("      STONE - PAPER - SCISSOR");

		System.out.println();
		System.out.println("Ready to Play STONE-PAPER-SCISSOR ");
		System.out.println();

		System.out.println("ENTER TO YOUR NAME PLAY :" );
		 String user = sc.next();
		System.out.println();




		// bot creation
		int randNum = 0;
		for( ; ;)
		{
			int num = (int) (Math.random()*10);

			if(num>=1&&num<=3)
			{
				randNum = num;
				break;
			}
		}
		// Bot Choice
		String botChoice = null;
		if (randNum == 1)
		{
			botChoice = "STONE";
		}
		else if (randNum == 2)
		{
			botChoice = "PAPER";
		}
		else 
		{
			botChoice = "SCISSOR";
		}
		 


		// user 
		
		 System.out.println("1. STONE  2. PAPER  3. SCISSOR ");
		 System.out.println("Enter Option  : ");
		 int opt = sc.nextInt();

		 String userChoice = null;

		 if (opt==1)
		 {
			 userChoice = "STONE";
		 }
		 else if (opt == 2)
		 {
			 userChoice = "PAPER";
		 }
		 else if (opt == 3)
		 {
			 userChoice = "SCISOR";
		 }
		 else 
		{
			 System.out.println("INVALID OPTION");
		}

		// game 

		if ((opt==1&&randNum==3)||(opt==2&&randNum==1)||(opt==3&&randNum==2))
		{
			System.out.println(user+"'s choice : " +userChoice +" , Bot's Choice : "+botChoice );
			System.out.println(user+"  Wins......");
		}
		else if ((opt==1&&randNum==2)||(opt==2&&randNum==3)||(opt==3&&randNum==1))
		{
				System.out.println(user+"'s choice : " +userChoice +" , Bot's Choice : "+botChoice );
				System.out.println("Bot Wins......");
		}
		else if ((opt==1&&randNum==1)||(opt==2&&randNum==2)||(opt==3&&randNum==3))
		{
				System.out.println("Draw......");
		}
		else
		{
			System.out.print("Game closes due to invalid option");
		}
	}
}
