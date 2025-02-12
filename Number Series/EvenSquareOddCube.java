import java.util.Scanner;
class EvenSquareOddCube 
{
	public static void main(String[] args) //the series of even num square and odd num cube 
	{                                      // expected output ----> 144 2197  196  3375  256
		System.out.print("How many numbers you want to print :  ");
		int end = new Scanner(System.in).nextInt();
		System.out.print("First "+end+" number of this series :");
		for (int num=1;num<=end ;num++ )        //we can start according to output we want 
		{
			int pow = 1;
			int p = num%2==0?2:3;
			for (int j = 1;j<=p ;j++ )
			{
				pow *= num;
			}
			System.out.print(pow +"  ");
			
		}

	}
}
