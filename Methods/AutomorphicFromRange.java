import java.util.Scanner;
class AutomorphicFromRange  {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter Start : ");
		int start = sc.nextInt();
		System.out.print(" Enter End : ");
		int end = sc.nextInt();

		while (start <= end) 
		{
			if (automorphic(start)) 
			{
				System.out.print(start + "  ");
			}
			start++;
		}

	}
	public static boolean automorphic(int num)
	{

		int div = 1;
		for (int i = num;i>0 ;i/=10 )
		{
			div *=10;
		}
		return (num==((num*num)%div));
	}
}