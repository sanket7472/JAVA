import java.util.Scanner;
class EVM
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("           WELCOME");
		System.out.println();
		int bjp=0 , cng=0, ss = 0, mns= 0, nota=0;
		System.out.println("Enter the Population Eligible for voting :");
		int pop = sc.nextInt();
		
		for(int i=1; i<=pop; i++)
		{
			System.out.println("***LIST OF PARTIES***");
			System.out.println("1. BJP");
			System.out.println("2. CONGRESS");
			System.out.println("3. SHIV SENA");
			System.out.println("4. M.N.S");
			System.out.println("5. Nota");
			System.out.println();
			System.out.println();

			int vote = sc.nextInt();
			if(vote<=0||vote>5)
			{
				// vote validation
				i--;
				System.out.println("INVALID VOTE");
			}

			// vote counting	
			if(vote==1)
			{
				System.out.println("Achhe Din");
				System.out.println();
				bjp++;
			}
			if(vote==2)
			{
				System.out.println("Bharat jodo");
				System.out.println();
				cng++;
			}
			if(vote==3)
			{
				System.out.println("Jay Maharashtra");
				System.out.println();
				ss++;
			}
			if(vote==4)
			{
				System.out.println("Marathi Manus Jagla Pahije");
				System.out.println();
				mns++;
			}
			if(vote==5)
			{
				System.out.println("Khud Khade Ho Jao");
				System.out.println();
				nota++;
			}
			
			// final result declare
			if(bjp>=cng&& bjp>=ss && bjp>= mns && bjp>= nota)
			{
				System.out.println("BJP Won the election by "+ bjp + "votes");
			}
			else if (cng>=bjp && cng>=ss && cng>= mns && cng>= nota)
			{
				System.out.println("CONGRESS Won the election by "+ cng + "votes");
			}
			else if (ss>=bjp && ss>=cng && ss>= mns && ss>= nota)
			{
				System.out.println("SHIVSENA Won the election by "+ ss + "votes");
			}
			else if (mns>=bjp && mns>=ss && mns>= cng && mns>= nota)
			{
				System.out.println("MNS Won the election by"+ mns + "votes");
			}
			else if (nota>=bjp && nota>=ss && nota>= cng && nota>= mns)
			{
				System.out.println("Result to be declared..");
			}
			
			
		}
	}
}
